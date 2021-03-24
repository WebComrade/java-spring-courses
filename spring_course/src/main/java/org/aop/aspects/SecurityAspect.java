package org.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(200)
public class SecurityAspect {
    @Before("org.aop.aspects.PointCuts.pointAdd()")
    public void secAddUser(){
        System.out.println("[beforeAddUser]: security ");
    }
}
