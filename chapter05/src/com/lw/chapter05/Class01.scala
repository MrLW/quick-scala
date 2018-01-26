package com.lw.chapter05
/**
 *  简单类和无参数方法
 */
object Class01 {

  def main(args: Array[String]): Unit = {
    val counter = new Counter
    println(counter.current())
  }
}

class Counter {
  private var value = 0;
  // 方法默认是公有的
  def increment() {
    value += 1;
  }
  
  def current() = value ;
  
  // 方法不带()定义
  def current2 = value ;

}