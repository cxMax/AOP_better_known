package com.cxmax.javassistdemo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @describe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 18-2-1.
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface LogTime {
}
