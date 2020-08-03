package com.au.spring.model;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AroundAspect {
	
	@Around("getPointCut()")
    public void log(JoinPoint jp){
        System.out.println("Around Aspect: " + jp.toString());
        System.out.println(jp.getSignature().getDeclaringType());
        System.out.println(jp.getTarget().getClass());
    }

    @Pointcut("execution(* getArea(..))")
    public void getPointCut() {}

}