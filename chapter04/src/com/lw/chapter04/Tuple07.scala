package com.lw.chapter04
/**
 *  元组：不同类型的值集合
 *  映射是键值对偶的集合,对偶是元组的最简单形式
 *  可以使用到函数返回值不值一个的情况
 */
object Tuple07 {
  def main(args: Array[String]): Unit = {
    // 定义一个元组,类型为Tuple3[Int,Double]
    val t = (1, 3.14);
    println(t)
    // 访问元组元素
    val second = t._1 ; // 也可以写成t _1
    val second2 = t _1;
    val one = t._2;
    val one2 = t _2;
    // 验证    函数返回值不值一个的情况
    println("New York".partition(_.isUpper))
  }
}