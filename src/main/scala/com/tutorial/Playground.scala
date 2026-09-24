package com.tutorial

def add(x:Int, y:Double):Double = {
   return x + y
}

@main def start(): Unit =
  println(add(42,13.04))