package com.lw.chapter08
/**
 *  scala继承层级
 *  ①与基本类型对应的类以及Unit类型都扩展自AnyVal
 *  ②其他类都是AnyRef的子类
 *  ③AnyVal和AnyRef都扩展Any类
 *  ④Nothing类型没有实例,void可由Unit类型表示;void由Unit类型表示,该类只有一个值,那就是(),注意Unit并不是其他类型的超类型,但是编译器允许任何值被替换成()
 */
object App11 {
  
  def printAny(x: Any) {
    println(x)
  }
  def printUnit(x: Unit) {
    println(x)
  }
  def main(args: Array[String]): Unit = {
    printUnit(())
    
  }
}