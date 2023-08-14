package com.cetalison.id_u8nv97m416f3

object Util:

  // id_tq4cwnqf3tdp
  // E.g.: payload ="12" Len = 3 Output=" 12"
  def leftpad(
      payload: String,
      target_len: Int,
      left_padding_char: Char = ' '
  ): String =

    val padding_number =
      target_len - payload.length
    assert(padding_number >= 0)
    val fill =
      left_padding_char.toString * padding_number
    fill + payload
