package com.lw.chapter09

import java.io.PrintWriter

/**
 * 写入文本文件
 * scala没有内置写文件支持,可借助java
 */
object App06 {
  def main(args: Array[String]): Unit = {
    val out = new PrintWriter("c://t.txt");
    for(i <- 1 to 100){
      out.print(i)
    }
    out.close();
  }
}