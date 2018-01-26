package com.lw.chapter11
/**
 * unapplySeq方法
 *
 */
object App10 {
  def main(args: Array[String]): Unit = {
     val Name(first, last) = "Li Wen"
     println(first)
     println(last)
  }
}
object Person {
  def unapplySeq(input: String): Option[Seq[String]] = {
      println("unapplySeq execute")
		  if (input.trim == "") None else Some(input.trim.split("\\s+"))
  }
  
  def unapply(input: String) = {
    println("unapply execute")
    val pos = input.indexOf(" ")
    if (pos == -1) None
    else Some((input.substring(0, pos), input.substring(pos + 1)))
  }
}