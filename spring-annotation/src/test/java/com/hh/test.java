package com.hh;
import com.hh.bean.Person;
import com.hh.bean.Yellow;
import com.hh.config.MainConfig;
import com.hh.config.MainConfig2;

import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class test {
  @Test
  public void fun(){
    ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(MainConfig.class);
    String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
    for (String beanDefinitionName : beanDefinitionNames) {
      System.out.println(beanDefinitionName);
    }
  }
  @Test
  public void fun2(){
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
    String[] people = applicationContext.getBeanNamesForType(Person.class);
    for (String person : people) {
      System.out.println(person);
    }
  }
  @Test
  public void fun3(){
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
    String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
    for (String beanDefinitionName : beanDefinitionNames) {
      System.out.println("容器中的bean name="+beanDefinitionName);
    }
    Yellow yellow = (Yellow) applicationContext.getBean("yellow");
    System.out.println("获取的bean"+yellow);
    System.out.println("ioc容器："+applicationContext);
  }

}
