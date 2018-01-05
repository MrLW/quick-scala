package com.lw.chapter01

object Demo03_apply {
  def main(args: Array[String]): Unit = {
    "Hello"(1); // e,实现原理是apply()方法
  }
}