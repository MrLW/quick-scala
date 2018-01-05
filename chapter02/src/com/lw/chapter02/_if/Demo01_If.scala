package com.lw.chapter02._if
/**
 * scala没有switch语句
 * scala中每个表达式都有返回值
 */
class Demo01_If {
  // 演示1
  val x = 2;
  val s = if (x > 0) 1 else -1;
  // 演示2 相当于三位运算符
  if (x > 0) 1 else -1;
  //scala中每个表达式都有类型,下面返回类型是Unit
  if (x > 0) 1 else ()
}