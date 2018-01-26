package com.lw.chapter06

/**
 * 枚举
 * id:如果不指定,则ID在前一个枚举值基础上+1,从零开始
 * name:缺省为字段名
 */
object Object06 {

  def main(args: Array[String]): Unit = {
    println(TrafficLightColor.Red)
    println(TrafficLightColor.Yellow)
    println(TrafficLightColor.Green)
    for(c <- TrafficLightColor.values) 
      println(c.id + ":" + c)
  }
  
  def doWhat(color:TrafficLightColor.TrafficLightColor) = {
    if(color ==TrafficLightColor.Red ) "stop"
    else if(color ==TrafficLightColor.Green ) "hurry up"
    else "go"
  }
}
object TrafficLightColor extends Enumeration {
  type TrafficLightColor = Value
  val Red = Value(0, "Stop")
  val Yellow = Value(10)
  val Green = Value("Go")
  val White = Value("White")
  val black = Value("black")
}