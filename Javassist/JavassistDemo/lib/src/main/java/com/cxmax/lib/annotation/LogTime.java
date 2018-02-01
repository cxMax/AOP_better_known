package com.cxmax.lib.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @describe :
 * @usage :
 * <p>
 * 打印方法耗时Log注解，javassisit修改class文件植入代码
 * 功能：自动打印方法的耗时
 * </p>
 * Created by caixi on 18-2-1.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface LogTime {
}
