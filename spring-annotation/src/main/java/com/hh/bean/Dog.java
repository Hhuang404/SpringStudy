package com.hh.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Dog {
  public Dog() {
    System.out.println("Dog constructor");
  }
  @PostConstruct
  public void init(){
    System.out.println("Dog 初始化");
  }
  @PreDestroy
  public void destroy(){
    System.out.println("Dog 销毁之前 调用的方法");
  }
}
