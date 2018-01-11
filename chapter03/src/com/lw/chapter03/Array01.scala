package com.lw.chapter03
/**
 *  定长数组
 */
object Array01 {
  def main(args: Array[String]): Unit = {
    // 定长数组
    val nums = new Array[Int](10);
    val s = Array("Hello", "World");
    // 访问元素
    println(s(0));

    val o = Array("test", 1);

  }
}