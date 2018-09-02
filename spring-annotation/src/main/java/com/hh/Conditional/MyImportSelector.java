package com.hh.Conditional;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
*author huangh
*date 2018/9/1 15:45
*description 自定义返回需要导入的组件
*/
public class MyImportSelector implements ImportSelector {
  public String[] selectImports(AnnotationMetadata annotationMetadata) {
//    annotationMetadata.get
    return new String[]{"com.hh.bean.blue"};
  }
}
