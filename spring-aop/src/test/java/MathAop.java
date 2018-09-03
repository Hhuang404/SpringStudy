import com.hh.aop.MathCalculator;
import com.hh.aop.MathConfig;
import org.junit.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MathAop {
  @Test
  public void fun1(){
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
        MathConfig.class);
    String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
    for (String beanDefinitionName : beanDefinitionNames) {
    System.out.println("容器中的bean:"+beanDefinitionName);
    }
    MathCalculator bean = (MathCalculator) applicationContext.getBean("mathCalculator");
   bean.dev(15, 3);

}
}
