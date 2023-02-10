package com.cetalison.id_u8nv97m416f3

import scala.io.AnsiColor._


@main
def main(): Unit =

  for x <- 1 to 128 do
    val nn = "%02d".format(x)
    println(s"$RESET\\u001b[${nn}m \u001b[${nn}m...Beispiel...$RESET")
  
  
