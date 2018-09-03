package com.hh.aop;


import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
*author huangh
*date 2018/9/3 15:39
*description spring 切面类
*/
@Aspect
//@Component
public class MathAspect {
  /*
   * 指定切点
   * 可以用*代替通用
   * 参数可以用..代替
   */
  @Pointcut("execution(public Object com.hh.aop.MathCalculator.dev(int,int))")
  public void pointCut(){}


  /*
   *前置通知
   * 通知注解 参数写法
   * 在本类中写入切点 ： 直接 method() 例如：pointCut()
   * 在外部引用的话： 写全类名 例如：com.hh.aop.MathAspect.pointCut()
   * JoinPoint 使用做参数必须放在第一位
   *
   */
  @Before("pointCut()")
  public void mathBefore(JoinPoint joinPoint){
//    getJoinPoint(joinPoint);
    Object[] args = joinPoint.getArgs();
    System.out.println("在"+joinPoint.getSignature().getName()+"1方法运行之前，参数{"+ Arrays.asList(args)+"}");
  }
  /*
   * 后置通知
   * 目标方法运行时出现异常 还是会执行 后置通知
   * 目标方法运行结束后无论如何都会执行 后置通知
   */
  @After("com.hh.aop.MathAspect.pointCut()")
  public void mathAfter(){
    System.out.println("dev方法结束{}");
  }
  /*
   * 返回通知
   * 在目标方法成功运行后返回的通知
   */
  @AfterReturning("pointCut()")
  public void mathReturning(){
    System.out.println("dev方法运行返回");
  }

  /*
   * 异常通知
   * 目标方法出现异常后会执行 异常通知
   */
  @AfterThrowing("pointCut()")
  public void  mathException(){
    System.out.println("dev方法出现异常 message={}");
  }
  /*
   *环绕通知
   * 动态代理，手动推进目标方法运行（joinPoint.procced()）
   */
  @Around("pointCut()")
  public void mathAround(){
    System.out.println("环绕通知运行");
  }
}
