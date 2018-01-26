package com.lw.chapter05
/**
 * 对象私有字段(注意:是对象而不是类)
 * 对象私有变量scala不会生成get、set方法
 */
object Class04 {
  
}

class Counter04 {
  private var value = 0 ;
  // 比上面更加严格,只能当前对象才能访问
  private[this] var newValue = 1 ;
  
  def increment() {
    value += 1 ;
  }
  
  def isLess(other:Counter04) = value < other.value
  
  
}
  
  
