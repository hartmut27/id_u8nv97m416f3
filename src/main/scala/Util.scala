package com.cetalison.id_u8nv97m416f3

object Util:

  // ID_TQ4CWNQF3TDP
  def leftpad(
      payload: String,
      target_len: Int,
      left_padding_char: Char = ' '
  ): String =
    val padding_number = target_len - payload.length
    assert(padding_number >= 0)
    val fill = left_padding_char.toString * padding_number
    fill + payload
