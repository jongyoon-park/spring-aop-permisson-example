package com.c.aopauth.annotation;

import com.c.aopauth.data.model.ApiPermission;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AccessiblePermission {
    ApiPermission[] permissions() default {};
}
