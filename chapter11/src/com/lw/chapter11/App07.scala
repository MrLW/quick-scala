package com.lw.chapter11

import scala.collection.mutable.HashMap

/**
 * apply和update方法
 */
object App07 {
  def main(args: Array[String]): Unit = {
    val scores = new HashMap[String, Int]
    scores("Bob") = 1 // 调用scores的update方法
    val bobScores = scores("Bob") // 调用scores的apply方法

  }
}
// apply也被用于伴生对象,用于构造对象而不显示new
class Fraction(n: Int, d: Int) {

}
object Fraction {
  def apply(n: Int, d: Int) = new Fraction(n, d)
}
