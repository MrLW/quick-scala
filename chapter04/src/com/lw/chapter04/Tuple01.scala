package com.lw.chapter04

import scala.collection.mutable.Map
import scala.collection.mutable.HashMap

/**
 *  构造映射
 */
object Tuple01 {
  def main(args: Array[String]): Unit = {
    // 不可变
    val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 2);
    // 可变
    val scores2 = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 2) ;
    // 空映射
    val scores3 = new HashMap[String,Int];
    // ->操作符创建对偶
    val pair = "Alice" -> 10 
    
  }
}