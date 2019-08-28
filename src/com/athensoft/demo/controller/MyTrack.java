package com.athensoft.demo.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyTrack {
	
//	@Pointcut("execution(public com.athensoft.demo.controller.*.*(..))")
	@Pointcut("execution(public * *(..))")
	public void k() {}
	
	@Before("k()")
	public void before(JoinPoint jp) {
		System.out.println("before running "+jp.getSignature().getName());
	}
}
