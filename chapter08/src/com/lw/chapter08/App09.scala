package com.lw.chapter08
/**
 *  抽象字段:scala除了拥有抽象方法外,还有抽象字段,抽象字段就是一个没有 初始化的字段
 */
object App09 {

  def main(args: Array[String]): Unit = {
    val fred = new Person09 {
      val id = 1
      var name = "Fred"
    }

    var e = new Employee09() {
      // 重写不了name
//      override var name = "liwen"
      // 可以重写
      override val id = 12
    }
    
  }
}
abstract class Person09 {
  val id: Int // 没有初始化,这是一个带有抽象getter方法的抽象字段
  var name: String // 另一个抽象字段,带有抽象getter和setter方法
}

// 抽象字段类的子类必须提供具体的字段,同方法一样,不需要override关键字
class Employee09() extends Person09 {
  val id = 1 
  var name = "";
}