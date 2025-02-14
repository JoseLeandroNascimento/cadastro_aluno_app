package com.example.cadastroalunoapp

import android.app.Application
import android.util.Log
import com.example.cadastroalunoapp.config.AppDatabase
import com.example.cadastroalunoapp.models.Aluno
import com.example.cadastroalunoapp.models.enums.Sexo
import java.util.Date

class App : Application() {

    lateinit var db: AppDatabase

    override fun onCreate() {
        super.onCreate()

        db = AppDatabase.getDatabase(this)

    }
}