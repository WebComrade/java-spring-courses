package org.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class PointCuts {
    @Pointcut("execution(* add*(..))")
    public void pointAdd(){}

    // @Before("execution(public void getBook(..))") - любое количество параметров
    // @Before("execution(public void getBook(String))") - параметр типа String
    // @Before("execution(public void getBook(org.aop.Book))") - параметр кастомного типа
}
