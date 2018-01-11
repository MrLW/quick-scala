package com.lw.chapter03
/**
 * 数组转换
 */
object Array04 {
  def main(args: Array[String]): Unit = {
    val a = Array(-2, 3, 5, -7, -11);
    // for-if实现转换
    val result = for (e <- a if e % 2 == 0) yield 2 * e;
    // filter实现转换
    val f = a.filter(_ % 2 == 0).map(2 * _);

    // 给定一个数组缓冲,移除除第一个负数之外的所有负数
    println(a.toBuffer);
    var first = true;
    val indexs = for (i <- 0 until (a.length) if first || a(i) >= 0) yield {
      if (a(i) < 0) first = false; a(i)
    }
    println(indexs)
  }
}