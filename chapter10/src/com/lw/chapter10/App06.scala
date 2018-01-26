package com.lw.chapter10

import java.util.Date

/**
 *  特质中抽象方法
 */
object App06 {
  def main(args: Array[String]): Unit = {
    
  }
}

trait Logger06 {
  def log(msg:String) // 这是抽象方法
}

trait TimestampLogger06 extends Logger06 {
  // 重写抽象方法
  abstract override def log(msg:String){
    super.log(new Date + " " + msg)
  }
}

