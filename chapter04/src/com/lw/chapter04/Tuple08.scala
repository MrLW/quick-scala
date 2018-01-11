package com.lw.chapter04


/**
 *  拉链操作
 *  使用场景:如果有一个键的集合,以及一个与之平行的值的集合,那么可以使用拉链将两者转换成一个映射
 */
object Tuple08 {
  def main(args: Array[String]): Unit = {
    val symbols = Array("<","-","-") ;
    val counts = Array(2,10,2) ;
    // 使用zip方法
    val pairs = symbols.zip(counts);
    for((s,n) <- pairs )
      Console.print(s * n )
    // 将对偶转换成映射
    pairs.toMap;
  }
}