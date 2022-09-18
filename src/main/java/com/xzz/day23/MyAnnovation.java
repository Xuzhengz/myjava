package com.xzz.day23;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

/**
 * @author 徐正洲
 * @date 2022/5/30-20:16
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyAnnovations.class)
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE,TYPE_PARAMETER,TYPE_USE})
public @interface MyAnnovation {
    String value() default "hello";
}
