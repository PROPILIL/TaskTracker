package com.propil.tasktracker.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.propil.tasktracker.data.util.TaskFather
import java.util.*

@Entity(tableName = "tasks")
data class TaskDbModel(
    @PrimaryKey
    val id: Int,
    val isDone: Boolean = false,
    val title: String?,
    val description: String?,
    val start: Date,
    val finish: Date
)