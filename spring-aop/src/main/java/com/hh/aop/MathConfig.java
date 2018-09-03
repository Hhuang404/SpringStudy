package com.hh.aop;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
*author huangh
*date 2018/9/3 15:40
*description 配置类
*/
@EnableAspectJAutoProxy
@Configuration
//@Import(value = {MathCalculator.class,MathAspect.class})
public class MathConfig {
  @Bean
  public MathCalculator mathCalculator(){
    return new MathCalculator();
  }
  @Bean
  public MathAspect mathAspect(){
    return new MathAspect();
  }
}
