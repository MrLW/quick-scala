package com.lw.chapter11
/**
 * 提取器 unapply方法
 */
object App08 {
  def main(args: Array[String]): Unit = {
    // 对String对象的一个提取器
    val Name(first, last) = "Li Wen"
    println(first + "" + last)
    println(Name)
  }
}
object Name {
  def unapply(input: String) = {
    val pos = input.indexOf(" ")
    if (pos == -1) None
    else Some((input.substring(0, pos), input.substring(pos + 1)))
  }
}