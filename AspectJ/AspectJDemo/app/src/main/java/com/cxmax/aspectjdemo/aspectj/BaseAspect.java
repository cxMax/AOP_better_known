package com.cxmax.aspectjdemo.aspectj;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @describe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 18-1-29.
 */
@Aspect
public class BaseAspect {

    private static final String TAG = "AspectJDemo";

    //testBeforeAndAfter前插入
    @Before("execution(* com.cxmax.aspectjdemo.MainActivity.testBeforeAndAfter(..))")
    public void activityOnMethodBefore(JoinPoint joinPoint) {
        String key = joinPoint.getSignature().toString();
        Log.e(TAG, "testBeforeAndAfter 方法前" + key);
    }

    //testBeforeAndAfter后插入
    @After("execution(* com.cxmax.aspectjdemo.MainActivity.testBeforeAndAfter(..))")
    public void activityOnMethodAfter(JoinPoint joinPoint) {
        String key = joinPoint.getSignature().toString();
        Log.e(TAG, "testBeforeAndAfter: 方法后" + key);

    }

    //在testBeforeAndAfter前后插入
    @Around("execution(* com.cxmax.aspectjdemo.MainActivity.testAround(..))")
    public void activityOnMethodAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String key = proceedingJoinPoint.getSignature().toString();
        Log.e(TAG, "testAround: 方法前" + key);
        proceedingJoinPoint.proceed();
        Log.e(TAG, "testAround: 方法后" + key);
    }
}