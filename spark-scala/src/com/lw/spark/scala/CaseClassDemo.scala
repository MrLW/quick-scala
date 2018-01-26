package com.lw.spark.scala
// 抽象类
abstract class Person
// case class

case class Student(name: String, age: Int, studentNo: Int) extends Person

case class Nobody(name: String) extends Person

object CaseClassDemo {
  def main(args: Array[String]): Unit = {
    // case class 会自动生成apply方法,省去new操作
    val p: Person = Student("john", 18, 1024)
    p match {
      case Student(name, age, studentNo) => println(name + "" + age + "" + studentNo)
    }
  }
}