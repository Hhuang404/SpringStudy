package com.hh.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
*author huangh
*date 2018/9/2 18:46
*description 通过 实现 xxxxAware接口 ，获得Spring底层组件
*/
@Component
public class Yellow implements ApplicationContextAware,EmbeddedValueResolverAware,BeanNameAware{

  private ApplicationContext applicationContext;
  /*
    获得ioc容器
   */
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.applicationContext = applicationContext;
    System.out.println("ioc 容器："+applicationContext);
    }
  /*
    获得字符串解析
   */
  public void setEmbeddedValueResolver(StringValueResolver resolver) {
    String s = resolver.resolveStringValue("读取properties文件的值：${person.name},SpEL语法#{10*100}");
    System.out.println("解析字符串："+s);
  }
  /*
    获得bean的name
   */
  public void setBeanName(String name) {
    System.out.println("bean 的 name="+name);
  }
}
