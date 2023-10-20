package com.intellekta.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(ToReleaseCont.class)
@Target(ElementType.METHOD)
public @interface ToRelease {
    String customerName() default " ";
    int version() ;


}
