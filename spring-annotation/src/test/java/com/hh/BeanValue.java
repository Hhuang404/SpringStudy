package com.hh;

import com.hh.bean.Person;
import com.hh.config.MainConfigOfBeanValue;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanValue {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
        MainConfigOfBeanValue.class);
  @Test
  public void fun(){
    String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
    for (String beanDefinitionName : beanDefinitionNames) {
      System.out.println(beanDefinitionName);
    }
    Person person = (Person) applicationContext.getBean("person");
    System.out.println(person);
    applicationContext.close();
  }
}
