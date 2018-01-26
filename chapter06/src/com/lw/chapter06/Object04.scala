package com.lw.chapter06
/**
 * apply 方法
 */
object Object04 {
  def main(args: Array[String]): Unit = {
    // 调用的是apply方法
    Array(100);
  }
}

class Account04 private (val id: Int, initialBalance: Double) {

  private val balance = initialBalance
  
  
}

