package com.lw.chapter06
/**
 * 伴生对象
 */
object Object02 {

}

class Account {
  val id = Account.newUniqueNum
  private var balance = 0.0;
  def deposit(amount: Double) {
    balance += amount
  }
}
// 伴生对象
object Account {
  private var lastNum = 0;

  private def newUniqueNum = {
    lastNum += 1;
    lastNum
  }
}