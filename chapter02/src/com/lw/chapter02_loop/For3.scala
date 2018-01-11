package com.lw.chapter02_loop
/**
 * for推导式
 */
object For3 {
  def main(args: Array[String]): Unit = {
    // Vector集合
    var v = for (i <- 1 to 10) yield i % 2;
    var y = for (c <- "Hello"; i <- 0 to 1) yield (c + i).toChar;
    var x = for (i <- 0 to 1; c <- "Hello") yield (c + i).toChar;
    println(v) // Vector
    println(x); // Vector
    println(y);// HIeflmlmop
  }
}