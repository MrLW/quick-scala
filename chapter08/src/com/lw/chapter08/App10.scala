 package com.lw.chapter08

/**
 *  构造顺序和提前定义
 */
object App10 {
  def main(args: Array[String]): Unit = {
    val a = new Ant
    println(a.env.length) // 0
    val a2 = new Ant2
    println(a2.env.length)
  }
}
// 这种写法会有问题
class Creature {
  val range :Int = 10 
  val env :Array[Int] = new Array[Int](range)
}

class Ant extends Creature {
   override val range = 2 
}
// 第二种写法:提前定义,可以在超类的构造器执行之前初始化子类的val字段
class Creature2{
  val range :Int = 10 
  val env :Array[Int] = new Array[Int](range)
}

class Ant2 extends {
   override val range = 2 
} with Creature2