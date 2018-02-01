package com.cxmax.aspectjdemo.aspectj;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @describe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 18-1-29.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface MyPointcuts {
}
