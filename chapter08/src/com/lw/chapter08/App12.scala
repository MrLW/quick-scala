package com.lw.chapter08
/**
 *  对象相等性
 *  ==、eq、equals的区别:
 *  ①equals检查值是否相等,eq检查引用是否相等,==调用的是==
 *  
 */
object App12 {

  def main(args: Array[String]): Unit = {
    val item1 = new Item("Pen",12);
    val item2 = new Item("Pen",12);
    println(item1.equals(item2));// true
    println(item1 == item2) ; // true 
    println(item1.eq(item2))// false
  }
}

class Item(val desc: String, val price: Double) {
  // 默认情况下equals调用eq方法
  final override def equals(other: Any) = {
    val that = other.asInstanceOf[Item];
    if (that == null) {
      false
    } else {
      desc == that.desc && price == that.price
    }
  }

  final override def hashCode = 13 * desc.hashCode + 17 * price.hashCode
}