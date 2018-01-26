package com.lw.chapter05

import scala.collection.mutable.ArrayBuffer

/**
 *  嵌套类
 */
object Class08 {
  
  def main(args: Array[String]): Unit = {
    val chatter = new NetWork
    val myFace = new NetWork
    
  }
}

class NetWork {
  class Member(val name :String ){
    val contacts = new ArrayBuffer
  }
  
  private val members = new ArrayBuffer[Member]
  
  def join(name :String ) = {
    val m = new Member(name)
    members += m ;
    m
  }
}