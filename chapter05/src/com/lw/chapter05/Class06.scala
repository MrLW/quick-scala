package com.lw.chapter05
/**
 *  辅助构造器
 *  如果一个类没有定义主构造器,则默认自动有一个无参构造器
 */
object Class06 {
  def main(args: Array[String]): Unit = {
    // 此时创建 对象
    val p1 = new Person06 // 主构造器
    val p2 = new Person06("lw") ;
    val p3 = new Person06("lw",22);
  }
}

class Person06{
  
  private var name = "" 
  private var age = 0 
  
  // 定义辅助构造器
  def this(name :String) {
    this() ; // 调用主构造器
    this.name = name ;
  }
  
  // 定义另一个辅助构造器
  def this(name:String,age:Int){
    this(name);// 调用另一个辅助构造器
    this.age = age ;
  }
}

