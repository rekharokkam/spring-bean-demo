package com.chapter3.componentscanning;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;;

/*
 * For additional information on the retention policy and stuff refer to - https://www.mkyong.com/java/java-custom-annotations-example/
 * 
 */


@Target ({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
@Retention (RetentionPolicy.RUNTIME) //Indicates that this is a runtime annotation
@Qualifier
public @interface MyQualifierAnnotation {

}
