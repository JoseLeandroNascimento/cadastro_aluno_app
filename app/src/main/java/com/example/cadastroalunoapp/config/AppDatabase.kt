package com.example.cadastroalunoapp.config

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.cadastroalunoapp.convertes.DateConverter
import com.example.cadastroalunoapp.daos.AlunoDao
import com.example.cadastroalunoapp.models.Aluno

@Database(entities = [Aluno::class], version = 1)
@TypeConverters(DateConverter::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun alunoDao(): AlunoDao

    companion object {

        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {

            return if (INSTANCE == null) {

                synchronized(this) {

                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "aluno_db"
                    ).build()
                }
                INSTANCE as AppDatabase
            } else {

                INSTANCE as AppDatabase
            }
        }
    }

}