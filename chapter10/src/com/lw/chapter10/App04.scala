package com.lw.chapter10
/**
 *  带有特质的对象
 */
object App04 {

  def main(args: Array[String]): Unit = {
    // 构造对象时添加特质,注意需要后面的会
    val acc = new SavingAccount with ConsoleLogger04 with ConsoleLogger14
    //acc.log("呵呵")
    acc.withdraw(100)
  }
}
trait Logged {
  def log(msg: String) {
    println("默认日志:" + msg )
  }
}
// 标准日志
trait ConsoleLogger04 extends Logged {
  override def log(msg: String) {
    println("标准日志之前")
    println("标准日志:" + msg)
    println("标准日志之后")
  }
}

trait ConsoleLogger14 extends Logged{
  override def log(msg: String) {
    println("2标准日志之前")
    println("2标准日志:" + msg)
    println("2标准日志之后")
  }
}

class SavingAccount extends Account with Logged {
  def withdraw(amount: Double) {
    if (amount > balance) log("insufficient funds")
    else
      log("amount<balance")
  }
}

