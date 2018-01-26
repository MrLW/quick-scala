package com.lw.chapter05

object Class02 {
  def main(args: Array[String]): Unit = {
    val p = new Person
    println(p.age);
    p.age = 11;
  }
}

class Person {
  var age = 0; // 公有字段
}

class PrivatePerson {
  private var privateAge = 0;
  // get method
  def age = privateAge;
  // set method
  def age_=(newValue: Int) {
    if (newValue > privateAge) privateAge = newValue
  }
}