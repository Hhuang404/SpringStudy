package com.hh;

import com.hh.config.MainConfigOfAutowired;
import com.hh.dao.BookDao;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanAutowired {
  @Test
  public void fun(){
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
        MainConfigOfAutowired.class);
    String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
    for (String beanDefinitionName : beanDefinitionNames) {
      System.out.println(beanDefinitionName);
    }
    BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
    System.out.println(bookDao);

  }
}
