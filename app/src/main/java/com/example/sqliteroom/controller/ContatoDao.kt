package com.example.sqliteroom.controller

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import androidx.room.Upsert
import com.example.sqliteroom.model.Contato
import kotlinx.coroutines.flow.Flow

@Dao
interface ContatoDao {

    @Upsert
    fun upsertContato(contato: Contato)

    @Delete
    fun deleteContato(contato: Contato)

//    @Update
//    fun updateContato(contato: Contato)

    @Query("SELECT * FROM contatos ORDER BY nome ASC")
    fun getContatoOrdenadoPeloNome(): Flow<List<Contato>>

    @Query("SELECT * FROM contatos ORDER BY sobrenome ASC")
    fun getContatoOrdenadoPeloSobrenome(): Flow<List<Contato>>

    @Query("SELECT * FROM contatos ORDER BY telefone ASC")
    fun getContatoOrdedandoPeloTelefone(): Flow<List<Contato>>

}