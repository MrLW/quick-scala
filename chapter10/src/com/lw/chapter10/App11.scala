package com.lw.chapter10

import java.io.PrintStream

/**
 *  初始化特质中的字段
 *  特质不能有构造器参数,每个特质都有一个无参数构造器,这也是特质和类的唯一技术差别
 */
object App11 {
  def main(args: Array[String]): Unit = {
  }
}


trait FileLogger10 extends Logger09 {
  val filename :String
  val out = new PrintStream(filename)
  def log() {
    println("文件吗:" + filename)
  }
}
