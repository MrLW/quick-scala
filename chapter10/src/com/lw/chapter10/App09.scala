package com.lw.chapter10
/**
 *  特质中抽象字段/特质的构造顺序
 *  1先调用超类构造器
 *  2特质构造器在超类构造器之后、类构造器之前执行
 *  3特质由左到右被构造
 *  4每个特质当中,父特质先被构造
 *  5如果多个特质公有一个父特质,而那个父特质已经被构造,则不会被再次构造
 *  6所有特质构造完毕后,子类才被构造
 */
object App09 {
  def main(args: Array[String]): Unit = {
    val sa = new SavingAccount09
    println("App")
  }
}

class SavingAccount09 extends Account09 with FileLogger09{
  println("4、SavingAccount09 构造器")
}

class Account09 {
  println("1、Account09 构造器")
}

trait Logger09 {
  println("2、Logger09 构造器")
}

trait FileLogger09 extends Logger09 {
  println("3、FileLogger09 构造器")
}




