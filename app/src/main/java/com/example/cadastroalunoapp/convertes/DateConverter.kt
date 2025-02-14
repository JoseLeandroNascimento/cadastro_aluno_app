package com.example.cadastroalunoapp.convertes

import androidx.room.TypeConverter
import java.util.Date

class DateConverter {

    @TypeConverter
    fun toDate(dateTime: Long?): Date? {
        return if(dateTime != null) Date(dateTime) else null
    }

    fun fromDate(date: Date?): Long? {
        return date?.time
    }
}