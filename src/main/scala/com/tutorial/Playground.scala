package com.tutorial
import scala.math._

@main def start(): Unit =
  //Ranges
  val range = 1 to 10 //1 to 10 inclusive
  val range2 = 1 until 10 //1 to 10 exclusive
  val range3 = 2 until 100 by 3 //jumps of 3
  //range3.toList

  //Number convenience methods
  val num = -59
  val numAbs = num.abs //absolute value
  numAbs.max(7)
  numAbs.min(7)
//  println(numAbs.min(55))

  //String operations
  "Scala".reverse //reverse a string
  "scala".capitalize //make first char caps
  "Scala!" * 7 //repeat n times
  "123".toInt //parse as Int
  println("scala is good".capitalize)

  //Useful methods on collections
  print(range.filter(_ >= 4)) //keep items larger than 4
  range2.map(_ * 2) //transform each item