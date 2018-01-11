package com.lw.chapter02_loop
/**
 * for 高级特性
 * 1、多个生成器,并且每一个生成器可以携带一个守卫if判断(if之前没有;)
 * 2、for中使用任意多定义
 */
object For2 {
  def main(args: Array[String]): Unit = {
    // 1
    for (i <- 1 to 3 if i >= 2; j <- 1 to 3 if i == j) {
      println(i + j)
    }
    // 2
    //for()
  }
}