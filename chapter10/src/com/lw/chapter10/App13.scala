package com.lw.chapter10

object App13 {

}

trait Logged13 {

}

trait LoggedException extends Logged13 {
  this: Exception =>
}