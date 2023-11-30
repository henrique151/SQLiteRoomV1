package com.example.appaularoomsql.model

import com.example.appaularoomsql.controller.Contato
import com.example.appaularoomsql.controller.Tipos

data class Contato(
    val contato: List<Contato> = emptyList(),
    val nome: String = "",
    val sobrenome: String = "",
    val telefone: String = "",
    val adicionarContato: Boolean = false,
    val tipos: Tipos = Tipos.nome
)
