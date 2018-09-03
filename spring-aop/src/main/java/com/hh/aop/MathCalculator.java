package com.hh.aop;

//@Component
public class MathCalculator {

  public Object dev(int i,int j){
    int i1 = i / j;
    System.out.println("运算结果"+i1);
    return i1;
  }

}
