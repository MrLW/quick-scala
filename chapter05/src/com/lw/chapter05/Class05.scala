package com.lw.chapter05

import scala.beans.BeanProperty

/**
 * scala bean
 */
object Class05 {
  
  
}

class Person05 {
  /**
   * 将会生成4个方法
   * ①name:String
   * ②name_=(newValue:String):Unit
   * ③getName():String
   * ④setName(newValue:String):Unit
   */
  @BeanProperty var name : String = _ 
}