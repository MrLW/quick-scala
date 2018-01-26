package com.lw.chapter08
/**
 *  类型检查和转换
 */
object App03 {
  def main(args: Array[String]): Unit = {
    val e = new Employee
    // e是person对象或者是其子类都可以
    if (e.isInstanceOf[Person]) {
      val p = e.asInstanceOf[Employee]
      println(e == p)
    }
    
    // e指向的是一个Employee对象但不是其子类
    if(e.getClass == classOf[Person]){
      println("success")
    }
    
    // 模式匹配,后序学习
    
  }
}