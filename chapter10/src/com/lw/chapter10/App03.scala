package com.lw.chapter10
/**
 *  具体实现的特质
 */
object App03 {

}
trait ConsoleLogger03 {
  def log(msg: String) {
     
  }
}
class Account {
  val balance:Double = 0.0
}
class SavingsAccount extends Account with ConsoleLogger03{
  
}