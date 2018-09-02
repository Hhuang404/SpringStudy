package com.hh.config;

import com.hh.bean.Person;
import com.hh.controller.BookController;
import com.hh.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import sun.awt.SunHints.Value;

/**
*author huangh
*date 2018/9/1 10:23
*description 配置类
*/
@Configuration
@ComponentScan(basePackages = "com.hh" ,includeFilters = {
//    @Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class}),
//    @Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookDao.class}),
      @Filter(type = FilterType.CUSTOM,classes = {MyFilterType.class})
    },useDefaultFilters = false)
//@Filter 过滤规则
//FilterType.ANNOTATION : 使用注解过滤
//FilterType.ASSIGNABLE_TYPE : 使用类过滤
//FilterType.ASPECTJ : ASPECTJ表达式
//FilterType.REGEX : 使用正则表达式
//FilterType.CUSTOM ：自定义 ，用法：创建一个实现TypeFilter的自定义类

//@ComponentScans(value = {
//    @ComponentScan(basePackages = "com.hh" ,excludeFilters = {
//        @Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})
//    },useDefaultFilters = true)
//})
public class MainConfig {
  @Bean
  public Person person(){
    return new Person("huangh",21);
  }
}
