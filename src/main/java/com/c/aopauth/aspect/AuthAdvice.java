package com.c.aopauth.aspect;

import com.c.aopauth.annotation.AnonymousCallable;
import com.c.aopauth.service.PermissionService;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Objects;

@Aspect
@Component
@RequiredArgsConstructor
@Order
public class AuthAdvice {

    private final PermissionService permissionService;

    @Before("com.c.aopauth.aspect.PointCuts.allController()")
    public void confirmPermissionBeforeController(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();

        if (permissionService.isAnonymousCallable(method)) {
            return;
        }

        permissionService.isAllowedPermission(method);
    }
}
