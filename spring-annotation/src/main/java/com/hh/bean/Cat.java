package com.hh.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
/**
*author huangh
*date 2018/9/2 9:27
*description 实现 初始化 和 销毁方法
*/
@Component
public class Cat implements InitializingBean,DisposableBean {

  public void destroy() throws Exception {
    System.out.println(" cat run destroy()");
  }

  public void afterPropertiesSet() throws Exception {
    System.out.println("cat run afterPropertiesSet()");
  }
}
