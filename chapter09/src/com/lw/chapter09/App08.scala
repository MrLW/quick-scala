package com.lw.chapter09

import java.io.ObjectOutputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.FileInputStream
import scala.collection.mutable.ArrayBuffer

/**
 *  序列化
 */
object App08 {
  def main(args: Array[String]): Unit = {
    val fred = new Person
    val out = new ObjectOutputStream(new FileOutputStream("d://demo.scala"))
    out.writeObject(fred)
    out.close()
    // 读取
    val in = new ObjectInputStream(new FileInputStream("d://demo.scala"))
    val savedFrdd = in.readObject().asInstanceOf[Person]
    println(savedFrdd)
  }
}

@SerialVersionUID(42L) class Person extends Serializable {
  private val friends = new ArrayBuffer[Person]
}