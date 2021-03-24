package org.aop.aspects;

import org.aop.Objects.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component // данный класс - компонент
@Aspect // данный класс - аспект
@Order(100) // порядок выполнения аспекта
public class LoggingAspect {

    @Before("org.aop.aspects.PointCuts.pointAdd()")
    public void logAddUser(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        if(methodSignature.getName().equals("addUser")) {
            User user = (User) args[0];
            System.out.println("[beforeAddUser]: adding user " + user);
        }
        else
            System.out.println("[beforeAddUser]: adding user");
    }

    @AfterReturning(pointcut = "org.aop.aspects.PointCuts.pointAdd()", returning = "user")
    public void logAfterAddUser(User user){
        System.out.println("[afterReturningAddUser]: user " + user +" successfully was added");
    }
    @AfterThrowing(pointcut = "org.aop.aspects.PointCuts.pointAdd()", throwing = "exception")
    public void logAfterExceptionAddUser(Throwable exception){
        System.out.println("afterThrowingAddUser]: exception was thrown " + exception);
    }

    @Around("org.aop.aspects.PointCuts.pointAdd()")
    public Object aroundAddUser(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("[aroundAddUser] trying to add user");
        Object result = joinPoint.proceed();
        System.out.println("[aroundAddUser] user "+result+" successfully was added");
        return result;
    }



}
