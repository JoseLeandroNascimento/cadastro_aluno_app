package com.example.cadastroalunoapp.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.cadastroalunoapp.models.enums.Sexo

@Entity(tableName = "aluno")
data class Aluno(
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,
    val nome:String,
    @ColumnInfo(name = "data_nascimento")
    val dataNascimento:Long,
    val sexo:Sexo
)
