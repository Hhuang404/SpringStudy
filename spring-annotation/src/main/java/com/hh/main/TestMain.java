package com.hh.main;

import com.hh.bean.Person;
import com.hh.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

  public static void main(String[] args) {
    //加载xml ，获取bean
     ApplicationContext xmlApplicationContext= new ClassPathXmlApplicationContext("beans.xml");
     Person XmlPerson = (Person) xmlApplicationContext.getBean("person");
     System.out.println(XmlPerson);

    //加载配置类 获取bean
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
    Person person = (Person) applicationContext.getBean("person");
    System.out.println(person);
  }
}
