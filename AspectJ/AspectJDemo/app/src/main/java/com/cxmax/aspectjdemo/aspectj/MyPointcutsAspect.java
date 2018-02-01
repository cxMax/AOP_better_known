package com.cxmax.aspectjdemo.aspectj;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @describe :
 * @usage : 自定义切点, 切面编程
 * <p>
 * </p>
 * Created by caixi on 18-1-30.
 */
@Aspect
public class MyPointcutsAspect {

    private static final String TAG = "AspectJDemo";

    //在我们自定义切点注释的方法处插入
    @Pointcut("execution(@com.cxmax.aspectjdemo.aspectj.MyPointcuts * *(..))")
    public void myPointcutsMethod() {
    }

    //在这些方法的前后插入
    @Around("myPointcutsMethod()")
    public void onMyPointcutsMethodAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String key = proceedingJoinPoint.getSignature().toString();
        Log.e(TAG, "方法调用之前插入: " + key);
        proceedingJoinPoint.proceed();
        Log.e(TAG, "方法调用之后插入: " + key);
    }
}
