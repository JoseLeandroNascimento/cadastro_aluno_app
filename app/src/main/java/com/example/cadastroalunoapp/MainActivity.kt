package com.example.cadastroalunoapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cadastroalunoapp.config.AppDatabase
import com.example.cadastroalunoapp.models.Aluno
import com.example.cadastroalunoapp.models.enums.Sexo
import java.util.Date

class MainActivity : AppCompatActivity() {

    private lateinit var db:AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        Thread{
            db = (application as App).db

            val alunoDao =  db.alunoDao()

            alunoDao.save(Aluno(
                nome = "teste",
                sexo = Sexo.MASCULINO,
                dataNascimento = Date().time
            ))


        }

    }
}