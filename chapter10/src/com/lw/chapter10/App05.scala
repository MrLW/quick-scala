package com.lw.chapter10

import java.util.Date

trait TimestampLogger extends Logged {
  override def log(msg:String){
    super.log(new Date + " " + msg)
  }
}

trait ShortLogger extends Logged {
  val maxLen = 15
  override def log(msg:String){
    super.log(
       if(msg.length() <= maxLen ) msg else msg.substring(0,maxLen - 3) + "..." 
    )
  }
}
/**
 * super调用的是特质层级中的下一个特质,具体是哪一个,要根据特质添加顺序决定
 * 一般来说,特质从最后一个开始处理
 */
object App05 {
  def main(args: Array[String]): Unit = {
    
  }
}