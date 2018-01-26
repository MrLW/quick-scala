package com.lw.chapter09

/**
 *  进程控制
 */
object App09 {
  def main(args: Array[String]): Unit = {
    import sys.process._
    "ls -al .."!
  }
}