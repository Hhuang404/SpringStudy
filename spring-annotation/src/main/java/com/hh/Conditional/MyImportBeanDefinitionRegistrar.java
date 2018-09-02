package com.hh.Conditional;

import com.hh.bean.yellow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
*author huangh
*date 2018/9/1 15:56
*description 手动导入bean
*/
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar{
  public void registerBeanDefinitions(AnnotationMetadata annotationMetadata,
      BeanDefinitionRegistry beanDefinitionRegistry) {
    //查看bean注册中心中是否包含 bean
       boolean blue = beanDefinitionRegistry.containsBeanDefinition("com.hh.bean.blue");
    if (blue){
      //手动注册一个bean
      RootBeanDefinition BeanDefinition = new RootBeanDefinition(yellow.class);
      beanDefinitionRegistry.registerBeanDefinition("yellow",BeanDefinition);
    }
  }
}
