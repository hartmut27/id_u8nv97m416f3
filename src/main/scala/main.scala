package com.cetalison.id_u8nv97m416f3

import Util.leftpad

import scala.io.AnsiColor.*

@main
def main(): Unit =
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
          ansicode + descr + s"$RESET" + " "
        print(token)
