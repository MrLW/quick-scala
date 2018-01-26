package com.lw.chapter11
/**
 *  结合性
 *  ::是右结合性的
 */
object App06 {
  def main(args: Array[String]): Unit = {
    val c = 1 :: 2 :: Nil
    println(c)
    // 以下代码等价于Nil.::2
    2::Nil
  }
}