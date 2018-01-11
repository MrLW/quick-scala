package com.lw.chapter02_fun

import java.text.MessageFormat

object Fun02 {
  // 1、变长参数,不能将一个参数序列传入,如果非要传,需要加:_*来告诉编译器参数为序列
  def sum(args: Int*) = {
    var result = 0;
    for (arg <- args) result += arg;
    result;
  }

  // 2、序列参数的实例-递归
  def recursiveSum(args: Int*): Int = {
    if (args.length == 0) 0
    else
      args.head + recursiveSum(args.tail: _*);
  }
  // 
  
  def main(args: Array[String]): Unit = {
    var s = sum(1, 2, 3, 4);
    //    var s2 = sum(1 to 10); error
    var s3 = sum(1 to 10: _*) // 告诉编译器将该参数当做一个序列处理
    println(s);
    
    // 注意事项 
    //AnyRef:所有引用类型的基类,
    //asInstanceOf 将引用转换为子类的引用
    val str = MessageFormat.format("The answoer to {0}  is {1}", "everything",42.asInstanceOf[AnyRef])
    println(str);
  }
}