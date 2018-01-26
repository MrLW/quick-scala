package com.lw.chapter09

import scala.io.Source

/**
 *  读取词法单元和数字
 */
object App03 {
  def main(args: Array[String]): Unit = {
    // 读取文件中所有已空格的词法单元
    val source = Source.fromFile("c://apr License.txt","utf-8");
    val tokens = source.mkString.split("\\S+");
  }
}