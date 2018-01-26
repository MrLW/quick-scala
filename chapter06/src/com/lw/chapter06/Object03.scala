package com.lw.chapter06

/**
 *  扩展类或特质的对象
 */
object Object03 {

  def main(args: Array[String]): Unit = {
    DoNothingAaction.redo()
  }
}

abstract class UndoableAction(val desc: String) {
  def undo(): Unit
  def redo(): Unit
}

object DoNothingAaction extends UndoableAction("Do Nothing") {
  override def redo(): Unit = {
    println("redo " + desc)
  }

  override def undo(): Unit = {
    println("undo " + desc)
  }
}
