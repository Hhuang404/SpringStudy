package com.hh.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
*author huangh
*date 2018/9/2 9:57
*description  在 bean对象初始化之前 之后 调用方法
*/
@Component
public class MyBeanPostProcessor implements BeanPostProcessor{
  /**
   * @param o 当前bean的对象
   * @param s 当前bean在ioc容器中的name
   * @return 可以返回当前bean对象，或者之后要用的对象，或者直接封装的对象
  */
  public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
    System.out.println("bean初始化之前"+s+"->"+o);
    return o;
  }

  public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
    System.out.println("bean初始化之后"+s+"->"+o);
    return o;
  }
}
