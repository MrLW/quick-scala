package com.lw.chapter10
/**
 *  特质:scala只有一个超类,但是可以有任意数量的特质
 */
object App02 {
  def main(args: Array[String]): Unit = {

  }
}
trait Logger {
  // 特质中未被实现的是抽象方法
  def log(msg: String)
}
// 重写特质的抽象方法时不需要给出override关键字
trait ConsoleLogger extends Logger {
  def log(msg: String): Unit = {
    println(msg)
  }
}
// 两个特质
class ConsoleLogger2 extends Logger with Serializable {
  def log(msg: String): Unit = {
    
  }
}