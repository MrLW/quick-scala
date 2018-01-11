package com.lw.chapter03
/**
 *  多维数组
 */
object Array07 {
  def main(args: Array[String]): Unit = {
    val matrix = Array.ofDim[Int](3,4);
    println(matrix)
    matrix(0)(0) = 1 ;
  }
}