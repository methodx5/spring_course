package com.javadev.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(2)
public class SecurityAspect {

    @Before("com.javadev.aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги/журналая");
        System.out.println("-----------------------------------------");
    }
}
