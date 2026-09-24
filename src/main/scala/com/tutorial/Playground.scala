package com.tutorial
import scala.math._

@main def start(): Unit =
  var Tau = Pi*3
  println(s"Happy $Tau Day")
  Tau = Tau / Pi
  println(s"Happy $Tau Day")
  printf("Now you have %.16f problems.", Math.nextAfter(2.0, 3))