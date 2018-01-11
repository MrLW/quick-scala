package com.lw.chapter02_loop
/**
 * for遍历方式
 * for ( i <- 表达式) {
 *
 * }
 *
 */
object For {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10) {
      println(i);
    }
    // 遍历字符串
    val s = "Hello";
    var sum = 0;
    for (j <- 0 until s.length) {
      sum += s(j);
    }
    println(sum);
    sum = 0 ;
    // 另一种方式
    for(ch <- "Hello"){
      sum += ch ;
    }
    println(sum);
  }
}