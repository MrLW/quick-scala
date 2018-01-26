package com.lw.chapter09

import scala.io.Source

object App01 {
  def main(args: Array[String]): Unit = {
    // 参数1:java.io.File或者字符串
    val source = Source.fromFile("c://apr License.txt","utf-8");
    val lineIterator = source.getLines();
    for(line <- lineIterator){
      println(line)
    }
    //转Array或者Buffer
    var lines = lineIterator.toBuffer
    // 将整个文件读取成一个字符串
    val contents = source.mkString;
    
    source.close()
  }
}