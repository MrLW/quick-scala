package com.lw.chapter05

import java.util.Properties
import java.io.FileReader


/**
 * 主构造器:直接定义在类定义后面
 */
object Class07 {
  def main(args: Array[String]): Unit = {
    val p = new Person07("lw",21)
    val p2 = new Person17("lw",22);
  }
}
// 主构造器
class Person07(val name:String,val age :Int){
  //print是主构造器一部分,每当有对象被创建时,下面代码就会被执行
  println("just constructed another person")
  def desc = name + "is " + age + "years old" ;
}
/**
 *  如果类名没有参数,则只是简单执行类体中的所有语句而已
 */
class MyProg {
  private val prop = new Properties
  prop.load(new FileReader("db.properties"));
  // 上述代码是主构造器的一部分
}
/**
 *  主构造器不带val、var
 *  
 */
class Person17(name:String,age:Int){ //
  def desc = name + " is " + age ;
}
// 私有化主构造函数
class Person27 private(name:String){
  
}



