package com.lw.chapter03

import scala.collection.mutable.ArrayBuffer
// 需要注意的是,command转List需要导入如下包
import scala.collection.JavaConversions.bufferAsJavaList

import scala.collection.JavaConversions.asScalaBuffer

/**
 *  与java的互操作
 */
object Array08 {
  def main(args: Array[String]): Unit = {
    val command = ArrayBuffer("ls", "aux", "ps");
    val pb = new ProcessBuilder(command)
    println(pb)
    val cmd =  pb.command() ;
    println(cmd)
  }
}