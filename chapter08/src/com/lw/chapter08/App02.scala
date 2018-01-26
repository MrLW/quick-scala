package com.lw.chapter08

class Person {
  override def toString = getClass.getName
}

class Employee extends Person {
  override def toString = super.toString
}
/**
 *  方法重写:override
 */
object App02 {

}