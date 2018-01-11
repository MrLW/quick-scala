package com.lw.chapter04

import scala.collection.mutable.HashMap

/**
 *  更新映射中的值
 */
object Tuple03 {
  def main(args: Array[String]): Unit = {
    val scores = new HashMap[String, Int];
    // 更新scores的值
    scores("Cindy") = 30;
    // 添加多个关系
    scores += ("Alice" -> 10, "Bob" -> 20);
    // 移除关系
//    scores -= ("Alice") ;
    println(scores)
  }
}