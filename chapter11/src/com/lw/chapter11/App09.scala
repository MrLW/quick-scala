package com.lw.chapter11
/**
 *  带单个参数或无参数的提取器
 */
object App019 {
  def main(args: Array[String]): Unit = {
    val Number(n) = "123"
    println(n)
  }
}
object Number {
  //Scala鼓励你在变量和函数返回值可能不会引用任何值的时候使用Option类型
  def unapply(input: String): Option[Int] =
    try {
      //如果有值可以引用，就使用Some来包含这个值。
      Some(Integer.parseInt(input.trim))
    } catch {
      //在没有值的时候，使用None，这是Option的一个子类。
      case ex: NumberFormatException => None
    }
}