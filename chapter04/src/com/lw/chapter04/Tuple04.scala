package com.lw.chapter04
/**
 * 遍历映射
 */
object Tuple04 {
  def main(args: Array[String]): Unit = {
    val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 2);
    // 遍历方式1
    for ((k, v) <- scores) println(k + ":" + v)
    // 反转一个映射
    for ((k, v) <- scores) yield (v, k)
  }
}