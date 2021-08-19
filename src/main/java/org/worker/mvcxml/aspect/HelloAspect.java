package org.worker.mvcxml.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author peiru wang
 * @date 2021/8/8
 */
public class HelloAspect {

    public void beforeService(){
        System.out.println("before service");
    }


    public void afterService() {
        System.out.println("after service");
    }

    public Object aroundService(ProceedingJoinPoint joinPoint) {
        System.out.println("aroundServiceBefore");
        Object result = null;
        try {
            result = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("aroundServiceAfter");
        return result;
    }
}
