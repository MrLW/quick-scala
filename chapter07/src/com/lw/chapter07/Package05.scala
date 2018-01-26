package com.lw.chapter07
// 定义包对象
package object people {
  var defaultName = "John Q. Public"
}

package people {
  class Person {
    var name = defaultName // 从包对象拿到的常量
  }
}

object Package05 {

}