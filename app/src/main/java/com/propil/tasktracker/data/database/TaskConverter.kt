package com.propil.tasktracker.data.database

import androidx.room.TypeConverter
import java.util.*

class TaskConverter {

    @TypeConverter
    fun mapDateToLong(date: Date): Long {
        return date.time
    }

    fun mapLongToDate(value: Long): Date {
        return value.let { Date(it) }
    }
}