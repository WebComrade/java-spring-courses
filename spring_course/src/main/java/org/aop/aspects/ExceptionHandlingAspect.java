package org.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(300)
public class ExceptionHandlingAspect {
    @Before("org.aop.aspects.PointCuts.pointAdd()")
    public void beforeGetExceptionHandlingAdvice(){
        System.out.println("[beforeAddUser]: catching exceptions while trying add user");
    }
}
