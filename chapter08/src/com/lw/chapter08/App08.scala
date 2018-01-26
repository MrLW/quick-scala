package com.lw.chapter08
/**
 * 抽象类
 */
object App08 {

}
abstract class Person08(val name: String) {
  def id: Int // 没有方法体,这是一个抽象方法
}
// 重写父类中抽象方法,不需要override关键字
class Employee08(name: String) extends Person08(name) {
  def id: Int = name.hashCode()
}