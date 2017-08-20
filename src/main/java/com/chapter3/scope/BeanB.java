package com.chapter3.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component ("beanB")
@Scope ("prototype")
public class BeanB {

}
