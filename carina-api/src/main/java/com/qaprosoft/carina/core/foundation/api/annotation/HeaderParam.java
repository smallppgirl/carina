package com.qaprosoft.carina.core.foundation.api.annotation;

import com.qaprosoft.apitools.annotation.processor.RelatedTo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = { ElementType.PARAMETER })
@Retention(value = RetentionPolicy.RUNTIME)
@Header(key = "", value = "")
public @interface HeaderParam {

    @RelatedTo(annotationClass = Header.class, field = "key")
    String key();

}
