package com.cetalison.id_u8nv97m416f3

object Util:
  
  def leftpad(
               payload: String, target_len: Int, padding_char: Char = ' '): String =
    val padding_number = target_len - payload.length
    assert(padding_number >= 0)
    val fill = padding_char.toString * padding_number
    fill + payload

   
   
