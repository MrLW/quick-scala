package com.lw.chapter03
/**
 *  遍历数组和缓冲
 */
object Array03 {
  def main(args: Array[String]): Unit = {
    val sum = Array("a","b", "c", "d", "e");
    // 直接遍历
    for (i <- 0 until (sum.length)) {
      println(i + ":" + sum(i))
    }
    println("----------------------------");
    // 遍历跳一跳
    for (i <- 0 until (sum.length,2)) {
      println(i + ":" + sum(i))
    }
    println("----------------------------");
    // 类似for-each遍历
    for(i <- sum ){
      println(i);
    }
  }
}