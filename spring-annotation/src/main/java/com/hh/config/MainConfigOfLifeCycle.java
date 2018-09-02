package com.hh.config;

import com.hh.bean.Car;
import com.hh.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
*author huangh
*date 2018/9/2 8:59
*description bean 的生命周期 配置类
*/
@Configuration
@ComponentScan("com.hh.bean")
public class MainConfigOfLifeCycle {
  @Bean(initMethod = "init",destroyMethod = "destroy")
  /*
   *指定bean定义的 初始化 和 销毁方法
   * 当前作用域如果是  单例模式 ： 则ioc容器启动后 会 获取 bean 同时 初始化方法也会执行
   * 当前作用域如果是  多例模式 ： 则ioc容器启动后 只有在调用bean的时候才会执行 初始化方法,
   * 关闭ioc容器 在多例模式下 不会执行销毁方法，
   * ioc容器不管理多例模式的bean
   */
  @Scope("prototype")
  public Car car(){
    return new Car();
  }

}
