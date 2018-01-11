package com.lw.chapter04

import scala.collection.SortedMap
import scala.collection.mutable.LinkedHashMap

/**
 * 已排序映射：scala只提供了不可变的树形映射而不是哈希映射,没有提供可变的
 */
object Tuple05 {
  def main(args: Array[String]): Unit = {
    // 不可变的树形映射而不是哈希映射
    val scores = SortedMap("Alice"->1,"Bob"->2,"Cindy"->3) ;
    // 如果要按插入树形访问所有键
    val months = LinkedHashMap() ;
  }
}