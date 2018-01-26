package com.lw.chapter09
/**
 * map:针对集合的典型变换操作,将某个函数应用到集合的每个元素,并且产生一个结果集合
 * flatMap:是map的一种扩展,在flatMap中会传入一个函数,该函数对每一个输入都会返回一个集合(注意不是元素),
 * 				然后,flatMap把生成的多个集合“拍扁”成为一个集合
 */
object MapAndFlatMap {
  def main(args: Array[String]): Unit = {

    val books = List("hadoop", "hive", "hdfs")
    val bsMap = books map { s => s.toUpperCase() }
    val bsFlatMap = books flatMap { s => s.toUpperCase }
    println(bsFlatMap)
    println(bsMap)
    
    
    // Nil是一个空的List,定义WieList<Nothing>,所有Nil是所有List<T>的子类
    /**
     * :+在尾部追加元素,+:在头部追加元素
     * ++ 用于连接两个集合
     * ::: 只能用于连接两个List类型的集合
     */
    val l = "A" :: "B" :: Nil
    println(l)
    val l2 = "A" +: "B" +: Nil
    println(l2)
    val l3 = Nil :+ "A" :+ "B"
    println(l3)
    val l4 = l ++ l2 
    println(l4)
    val l5 = l4 ::: l3 
    println(l5)
  }
}