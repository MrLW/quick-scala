package com.lw.spark.scala
/**
 * 模式匹配
 */
class PatternMatching extends App {
  // 和java类似的匹配模式
  for (i <- 1 to 100) {
    i match {
      case 10 => println(10)
      case 20 => println(20)
      case 30 => println(30)
      case 40 => println(40)
      case _  =>
    }
    // 更丰富
    for (i <- 1 to 100) {
      i match {
        case 10                => println(10)
        case 20                => println(20)
        case 30                => println(30)
        // 增加守卫条件
        case _ if (i % 4 == 0) =>println(i + "能被4整除")
        case _ if(i % 3 == 0 ) => println(i + "能被4整除")
      }
    }
    
  }
}