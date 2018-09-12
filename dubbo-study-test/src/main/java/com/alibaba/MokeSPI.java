package com.alibaba;

/*
 * 描述:
 * @auth zhengkk19738
 * @time 2018/9/12
 */

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface MokeSPI {


    /**
     * default extension name
     */
    String value() default "";

}
