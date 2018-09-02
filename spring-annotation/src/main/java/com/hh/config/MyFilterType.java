package com.hh.config;

import java.io.IOException;
import java.util.Set;
import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.stereotype.Controller;

/**
 *author huangh
 *date 2018/9/1 11:56
 *description 自定义验证类
 */
public class MyFilterType implements TypeFilter {

  public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
      throws IOException {
    //获取注解的类信息
    AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
    //获取类的信息
    ClassMetadata classMetadata = metadataReader.getClassMetadata();
    //获取类的资源（url等）
    Resource resource = metadataReader.getResource();
    System.out.println("--->"+classMetadata.getClassName());
    if (annotationMetadata.getClassName().contains("er")){
      return true;
    }
    return false;
  }
}
