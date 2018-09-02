package com.hh.Conditional;


import java.nio.charset.CodingErrorAction;
import java.util.EventListener;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 *author huangh
 *date 2018/9/1 14:40
 *description 判断类
 */
public class WindowsConditional implements Condition {

  public boolean matches(ConditionContext conditionContext,
      AnnotatedTypeMetadata annotatedTypeMetadata) {
    //1 可以获得 创建ioc容器的bean工厂
    ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
    //2 可以获得 类加载器
    ClassLoader classLoader = conditionContext.getClassLoader();
    //3 ioc容器运行时的环境
    Environment environment = conditionContext.getEnvironment();
    //4 bean 的注册定义
    BeanDefinitionRegistry registry = conditionContext.getRegistry();
    //判断当前环境是否是windows
    if (environment.getProperty("os.name").contains("windows")){
      return true;
    }
    return false;
  }
}
