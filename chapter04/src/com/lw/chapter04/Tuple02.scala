package com.lw.chapter04
/**
 *  获取映射中的值
 */
object Tuple02 {
  def main(args: Array[String]): Unit = {
    val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 2)
    val bobScore = scores("Bob")
    println(bobScore);
    // 先判断
    val cindyScore = if (scores.contains("Cindy")) scores("Bob") else 0;
    // 快捷写发
    val aliceScore = scores.getOrElse("Alice", 0);
  }
}