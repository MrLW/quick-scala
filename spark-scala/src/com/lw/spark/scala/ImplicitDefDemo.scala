package com.lw.spark.scala
/**
 *  隐式转换
 *  两种类型:1 implicit def 形式的隐式转换
 *  			2    隐式类形式的隐式转换
 */
object ImplicitDefDemo {
  // 第一种
  object MyImplicitTypeConversion {
    implicit def strToInt(str: String) = str.toInt
  }
  implicit class MyImplicitTypeConversion2(val str: String) {
    def strToInt = str.toInt
  }
  def main(args: Array[String]): Unit = {
    //    math.max("1", 2); error
    import MyImplicitTypeConversion.strToInt
    val max = math.max("1", 1)
  }
}