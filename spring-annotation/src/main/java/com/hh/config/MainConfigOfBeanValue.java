package com.hh.config;

import com.hh.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
*author huangh
*date 2018/9/2 15:23
*description 配置类 ->使用@value标注的bean
*/
@PropertySource(value = "classpath:/name.properties")
@Configuration
public class MainConfigOfBeanValue {
  @Bean
  public Person person(){
    return new Person();
  }
}
