package com.lw.chapter05

import java.util.Date
/**
 * 只带getter
 */
object Class03 {
  
}
// 1、通过val实现,但是timeStamp永远不变
class Message {
  // 会生成一个私有的final字段和get方法,没有set方法
  val timeStamp = new Date
}

// 2、通过
class Count{
  private var value = 0 ;
  
  def increment(){
    value += 1 ;
  }
  
  def current = value ;
}