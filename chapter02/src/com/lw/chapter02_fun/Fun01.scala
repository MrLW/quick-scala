package com.lw.chapter02_fun

object Fun01 {
  //  	def abs(x Int) = if (x > 0) x else -x ;
  //2、 对于函数体有多个表达式
  def fac(n: Int) = {
    var r = 1;
    for (i <- 1 to n) r = r * i;
    r;
  }
  //3、递归函数,必须指定返回类型,此处使用Int
  def fac2(n: Int): Int = if (n <= 0) 1 else n * fac2(n - 1);
  // 4、默认参数和带名参数
  def decorate(str: String, left: String = "[", rigth: String = "]") = left + str + rigth;
    
  def main(args: Array[String]): Unit = {
    // 带名参数
    var s = decorate(str="Word",rigth=">>");
    println(s);
  }
}