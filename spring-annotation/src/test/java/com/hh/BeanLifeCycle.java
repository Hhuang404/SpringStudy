package com.hh;

import com.hh.config.MainConfigOfLifeCycle;
import org.junit.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanLifeCycle {
  @Test
  public void  fun1(){
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
        MainConfigOfLifeCycle.class);
    System.out.println("容器创建完成");
    //调用bean ，多例模式才会执行初始化方法
    Object cat = applicationContext.getBean("cat");
    System.out.println(cat);
    //销毁容器
    applicationContext.close();
  }
}
