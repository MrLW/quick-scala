package com.lw.chapter08

abstract class Person06 {
  def id: Int // 每个人都有计算id的方法
  var age: Int
}
class Student(override val id: Int, override var age: Int) extends Person06 {
}

class A {
  val age = 1;
}

/**
 * def 只能重写另一个def
 * val只能重写另一个val或者不带参数的def
 * var只能重写另一个抽象的var
 */
object App06 {

  def main(args: Array[String]): Unit = {
    // 这会创建一个结构类型的对象
    val alien = new Student(1, 21) {
      def greeting = "Hello , I am 31 years old"
    }
    println(alien.greeting)
  }

}

