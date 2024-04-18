package com.cysiv.caching;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
@Import(CachingConfiguration.class)
@ComponentScan({"com.cysiv.caching"})
public @interface EnableDataCaching {
}
