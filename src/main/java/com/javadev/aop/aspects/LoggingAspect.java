package com.javadev.aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* com.javadev.aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(public void com.javadev.aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary (){}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary (){}
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary ()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice (){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
//    }





//    @Pointcut("execution(* com.javadev.aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(* com.javadev.aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary() {
//    }g
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("loggingBeforeAllGetAndReturnMethods: Log #3");
//    }
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("loggingBeforeAllGetMethods: Log #1");
//    }
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("loggingBeforeAllGetMethods: Log #2");
//    }


    @Before("com.javadev.aop.aspects.MyPointCuts.allGetMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetAdvice: логирование попытки получить книгу/журнал");
    }

    @Before("execution(* returnBook())")
    public void beforeReturnAdvice(){
        System.out.println("beforeReturnAdvice: попытка вернуть книгу");
    }

}
