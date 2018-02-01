package com.cxmax.lib.annotation;

/**
 * @describe :
 * @usage :
 * <p>
 * 在非Activity和Fragment中使用该注解，会自动在其方法体后面加注册逻辑
 * </p>
 * Created by caixi on 18-2-1.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BusRegister {
}
