package com.lw.chapter09

import scala.io.Source

/**
 * 从URL读取
 */
object App04 {
  def main(args: Array[String]): Unit = {
    val source1 = Source.fromURL("http://www.baidu.com")
    println(source1.mkString)
  }
}