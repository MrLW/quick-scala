package com.lw.chapter02_fun

import scala.io.Source

/**
 * 当val被申明成lazy时,它的初始化被推迟,直到首次对它取值
 */
object Lazy01 {
  def main(args: Array[String]): Unit = {
    lazy val words = Source.fromFile("c://apr License.txt").mkString;
    println(words);
  }
}