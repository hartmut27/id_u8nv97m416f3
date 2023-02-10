package com.cetalison.id_u8nv97m416f3

import Util.leftpad

import scala.io.AnsiColor.*

// siehe Übersicht
// https://stackoverflow.com/questions/4842424/list-of-ansi-color-escape-sequences

@main
def main(): Unit =
  println("""
      |b = bold/bright 
      |r = reversed
      |c = 256 Colors, set foreground 
      |C = 256 Colors, set background 
      |""".stripMargin)

  enum Modus {
    case Normal, Foreground_256, Background_256
  }

  var vorgang: Int = 0
  for e <- Modus.values do
    for i <- 1 to 256 do
      for reverse <- 0 to 1 do
        for bold <- 0 to 1 do
          val ansicode = s"\u001b[" +
            (e match
              case Modus.Normal         => ""
              case Modus.Foreground_256 => "38;5;"
              case Modus.Background_256 => "48;5;"
            ) +
            s"${i}m"
          val descr = leftpad(
            payload = i.toString,
            target_len = 3
          )
          val token = s"$RESET" +
            (if bold == 1 then BOLD else "") +
            (if reverse == 1 then REVERSED else "") +
            ansicode + " " + descr + " " +
            (if bold == 1 then "b" else " ") +
            (if reverse == 1 then "r" else " ") +
            (e match
              case Modus.Normal         => " "
              case Modus.Foreground_256 => "c"
              case Modus.Background_256 => "C"
            ) +
            s"$RESET" + " "
          vorgang += 1
          print(token + (if (vorgang % 8 == 0) "\n" else ""))
