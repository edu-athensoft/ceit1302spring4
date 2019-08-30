package com.athensoft.demo.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
@Aspect
@Component
public class MyTrack {
	
//	@Pointcut("execution(public com.athensoft.demo.controller.*.*(..))")
//	@Pointcut("execution(public * *(..))")
	@Pointcut("execution(public * com.athensoft.*.controller.*.*(..))")
	public void k() {}
	
	@Before("k()")
	public void before(JoinPoint jp) {
		System.out.println("before running "+jp.getSignature().getName());
	}
	
	@After("k()")
	public void after(JoinPoint jp) {
		System.out.println("after running "+jp.getSignature().getName());
	}
}
