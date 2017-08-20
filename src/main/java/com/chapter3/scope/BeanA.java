package com.chapter3.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component ("beanA")
@Scope ("singleton")
public class BeanA {

}
