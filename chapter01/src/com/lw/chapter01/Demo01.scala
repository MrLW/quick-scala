package com.lw.chapter01
/**
 * 1、val:变量不会变
 * 2、
 */
class Demo01  {
  
  val answer = 8 * 5 + 2;
  //  answer = 2 ; error
  // 指定类型
  val greeting: String = null;

  val greeting2: Any = "Hello";

  val xmax, ymax = 100;

  val greeting3, greeting4: String = null;
  
  // 在scala中不去区分基本类型和对象类型
  1.toString();
  1.to(20);
}