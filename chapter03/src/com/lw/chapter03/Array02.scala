package com.lw.chapter03

import scala.collection.mutable.ArrayBuffer

/**
 * 变长数组
 */
object Array02 {
  def main(args: Array[String]): Unit = {
    val b = ArrayBuffer[Int]();
    b += 1;
    b += (2, 3, 4, 5);
    // ++=操作符追加任何集合
    b ++= Array(6, 7);
    // 移除最后2个元素
    b.trimEnd(2);
    b.insert(2, 22);
    println(b.toArray);
  }
}