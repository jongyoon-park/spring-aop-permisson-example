package com.c.aopauth.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order
public class PointCuts {

    @Pointcut("execution(* com.c.aopauth.controller..*.*(..))")
    public void allController() {

    }

    @Pointcut("execution(* com.c.aopauth.service..*.*(..))")
    public void allService() {

    }
}
