package com.lw.chapter09

import scala.io.Source
/**
 * 读取字符
 */
object App02 {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("c://apr License.txt","utf-8");
    for(c <- source){
      println(c)
    }
  }
}