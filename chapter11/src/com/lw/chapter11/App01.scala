package com.lw.chapter11
/**
 * ``有时候可以作为逃生舱门
 */
object App01 {
  def main(args: Array[String]): Unit = {
    Thread.`yield`()
  }
}