package com.javadev.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.javadev.aop")
@EnableAspectJAutoProxy
public class MyConfig {

}
