package com.lw.chapter02_fun
/**
 * 过程:如果函数体包含在花括号但是前面没有=号,那么返回的类型是Unit,这样的函数叫过程
 */
object Procedure01 {
  def box(s: String) {
    var border = "Hello";
    println(border);
  }
}