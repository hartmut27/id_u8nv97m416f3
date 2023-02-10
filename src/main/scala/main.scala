package com.cetalison.id_u8nv97m416f3

import Util.leftpad

import scala.io.AnsiColor.*

@main
def main(): Unit = {

  // \u001b[${nn}m    
  
  for n <- 1 to 128 do
    val ansicode = s"\u001b[${n}m"
    val descr = leftpad(
      payload = n.toString,
      target_len = 3)
    val token = s"$RESET" + ansicode + descr + s"$RESET" + " "
    print(token)

}