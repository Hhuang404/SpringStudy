package com.hh.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Person {

  /* 1,直接写基本数值
   * 2，SpEL 语法 ：#{}
   * 3，${}  取出properties中的数据,写入key值，需要在配置类中加入@PropertySource导入properties文件
   * 才能获取
   */
  @Value("黄浩")
  private String name;
  @Value("#{20-15}")
  private Integer age;
  @Value("${person.name}")
  private String realName;

  public Person(String name,Integer age) {
    this.name = name;
    this.age = age;
  }
}
