package com.lw.chapter09

import java.io.File
import java.io.FileInputStream

/**
 *  读取二进制,借助java类
 */
object App05 {
  def main(args: Array[String]): Unit = {
    val file = new File("c://apr License.txt");
    val in = new FileInputStream(file);
    val bytes = new Array[Byte](file.length().toInt)
    in.read(bytes);
    in.close();
  }
}