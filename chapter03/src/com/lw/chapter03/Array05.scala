package com.lw.chapter03

import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting

/**
 *  常用算法
 */
object Array05 {
  def main(args: Array[String]): Unit = {
    val s = ArrayBuffer(1, 2, 3);
    println(s.max);
    println(s.min);
    println( s.mkString("-"));
  }
}