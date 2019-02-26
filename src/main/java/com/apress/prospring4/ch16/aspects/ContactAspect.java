package com.apress.prospring4.ch16.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ContactAspect {
	@Around("execution(* com.apress.prospring4.ch16.Contact.setLastName())")
	public Object contactAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println("Contact:: Before invoking some method");
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("EmployeeXMLConfigAspect:: After invoking some method. Return value="+value);
		return value;
	}
}
