package com.hh.config;

import com.hh.Conditional.MyImportBeanDefinitionRegistrar;
import com.hh.Conditional.MyImportSelector;
import com.hh.Conditional.WindowsConditional;
import com.hh.bean.Person;
import com.hh.bean.Yellow;
import com.hh.bean.red;
import com.sun.org.apache.bcel.internal.util.ClassPath;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Redefinable;
import com.sun.xml.internal.messaging.saaj.util.RejectDoctypeSaxFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import sun.awt.geom.AreaOp.EOWindOp;

/**
*author huangh
*date 2018/9/1 13:59
*description 配置类2
*/
@Configuration
//@Component
@Import({red.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
/*
 *@import自动快速导入bean
 *    name 默认是 全类名  例如：com.hh.bean.red
 *@importSelector
 *    返回自定义需要导入的bean组件
 *@ImportBeanDefinitionRegistrar
 *    手动自定义导入一个bean组件
 */
@PropertySource("classpath:/name.properties")
public class MainConfig2 {
  //    ConfigurableBeanFactory 类
  //    String SCOPE_SINGLETON = "singleton"; 单例模式（默认），创建ioc容器中自动 添加bean 运行方法 到容器，之后到容器中拿
  //    String SCOPE_PROTOTYPE = "prototype"; 多例模式 ， 只有获取这个bean的时候才会运行
  @Bean
  @Lazy
  /*Lazy懒加载
   *    针对单例模式，在ioc容器创建后不会自动加载，而是第一次使用后加载
   */
  public Person person(){
    System.out.println("给ioc容器添加对象");
    return new Person("zhangsan",35);
  }

  @Conditional(WindowsConditional.class)
  /*
   * Conditional 判断是否满足条件，不满足就不会添加bean
   *   创建条件类 实现condition
   */
  @Bean
  public Person person1(){
    return new Person("bill",65);
  }

  @Bean
  public Yellow yellow(){
    return new Yellow();
  }
}
