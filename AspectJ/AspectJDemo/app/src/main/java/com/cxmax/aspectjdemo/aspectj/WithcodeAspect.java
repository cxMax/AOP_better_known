package com.cxmax.aspectjdemo.aspectj;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @describe :
 * @usage : 也是通过Pointcut 精准在方法插入
 * <p>
 * </p>
 * Created by caixi on 18-1-30.
 */

@Aspect
public class WithcodeAspect {

    private static final String TAG = "AspectJDemo";


    // 在testWithcode2()方法内插入
    @Pointcut("withincode(* com.cxmax.aspectjdemo.MainActivity.testWithcode2(..))")
    public void testWithcode2Method() {
    }

    // 调用testComment()方法的时候插入
    @Pointcut("call(* com.cxmax.aspectjdemo.MainActivity.testComment(..))")
    public void testCommentMethod() {
    }

    // 同时满足以上条件，在testWithcode2()方法内调用testComment()方法的时候才插入
    @Pointcut("testWithcode2Method() && testCommentMethod()")
    public void testWithcode2MethodOnlyInvoke() {
    }

    //在这些方法的后面插入
    @After("testWithcode2MethodOnlyInvoke()")
    public void beforeWithcode2MethodOnlyInvoke(JoinPoint joinPoint) {
        String key = joinPoint.getSignature().toString();
        Log.e(TAG, "beforeWithcode2MethodOnlyInvoke: " + key);
    }

}