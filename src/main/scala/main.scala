package com.cetalison.id_u8nv97m416f3

import scala.io.AnsiColor._


@main
def main(): Unit =
  
  // \u001b[${nn}m
  
  for n <- 1 to 128 do
    val f = s"\u001b[${n}m"
    val g = s"$RESET" + f + "Lorem" + s"$RESET" + " "
    print(g)
  
  
