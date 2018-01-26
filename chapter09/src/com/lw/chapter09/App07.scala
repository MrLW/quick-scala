package com.lw.chapter09

import java.io.File
import scala.collection.immutable.List

/**
 * 访问目录
 */
object App07 {
  def main(args: Array[String]): Unit = {
     val file = new File("c://")
     for( d <- subdirs(file)){
       println(d)
     }
  }
  
  def subdirs(dir:File):Iterator[File] = {
    val children = dir.listFiles.filter(_.isDirectory());
    children.toIterator ++ children.toIterator.flatMap(subdirs _)
  }
  
}