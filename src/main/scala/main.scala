package com.cetalison.id_u8nv97m416f3

import Util.leftpad

import scala.io.AnsiColor.*

@main
def main(): Unit =
  println("""
      |b = Bold
      |r = Reversed
      |""".stripMargin)

  var vorgang: Int = 0
  for reverse <- 0 to 1 do
    for bold <- 0 to 1 do
      for n <- 1 to 128 do
        val ansicode = s"\u001b[${n}m"
        val descr = leftpad(
          payload = n.toString,
          target_len = 3
        )
        val token = s"$RESET" +
          (if bold == 1 then BOLD else "") +
          (if reverse == 1 then REVERSED else "") +
          ansicode + " " + descr + " " +
          (if bold == 1 then "b" else " ") +
          (if reverse == 1 then "r" else " ") +
          s"$RESET" + " "
        vorgang += 1
        print(token + (if (vorgang % 8 == 0) "\n" else ""))
