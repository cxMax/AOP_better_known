package com.cxmax.lib.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @describe :
 * @usage :
 * <p>
 * 在非Activity和Fragment中使用该注解，会自动在其方法体后面加反注册逻辑
 * </p>
 * Created by caixi on 18-2-1.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BusUnRegister {
}
