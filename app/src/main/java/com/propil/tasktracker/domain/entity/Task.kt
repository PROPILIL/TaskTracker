package com.propil.tasktracker.domain.entity

import com.propil.tasktracker.data.util.TaskFather
import java.util.*

data class Task(
    val id: Int,
    val isDone: Boolean = false,
    val title: String?,
    val description: String?,
    val start: Date,
    val finish: Date
) {


}