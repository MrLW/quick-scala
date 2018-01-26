package com.lw.chapter10
/**
 * 当做富接口使用的特质
 */
object App07 {
  def main(args: Array[String]): Unit = {
    val s = new SavingAccount07
    s.warn("Hello World")
  }
}
class SavingAccount07 extends Account with Logger07 {
  override def log(msg: String) {
    println(msg)
  }
}

trait Logger07 {

  def log(msg: String)

  def info(msg: String) {
    log("info:" + msg)
  }
  def warn(msg: String) {
    log("warn:" + msg)
  }
  def severe(msg: String) {
    log("severe" + msg)
  }
}