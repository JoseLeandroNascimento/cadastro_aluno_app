package com.example.cadastroalunoapp.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.cadastroalunoapp.models.Aluno

@Dao
interface AlunoDao  {

    @Query("SELECT * FROM aluno")
    fun getAluno():List<Aluno>

    @Insert
    fun save(aluno:Aluno)
}