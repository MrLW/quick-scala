package com.lw.chapter04
/**
 *  和JAVA的操作
 */

import scala.collection.mutable.Map
import java.util.TreeMap
import java.awt.Font

object Tuple06 {
  def main(args: Array[String]): Unit = {
    // 将java的map转成scala的map
    import scala.collection.JavaConversions.mapAsScalaMap
    val scores: Map[String, Int] = new TreeMap[String, Int];
    // 将Properties转换成Map
    import scala.collection.JavaConversions.propertiesAsScalaMap
    val props: scala.collection.Map[String, String] = System.getProperties();
    // 将scala映射传递给java映射
    import scala.collection.JavaConversions.mapAsJavaMap
    import java.awt.font.TextAttribute._
//    val attrs = Map(family -> "serif", size -> 12);
    val attrs = Map("family" -> "serif", "size" -> 12);
   // val font = new Font(attrs); 
  }
}