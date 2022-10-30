package com.propil.tasktracker.data.util

import java.util.*

sealed class TaskFather {
    abstract val id: Int
    abstract val isDone: Boolean
    abstract val title: String?
    abstract val description: String?
    abstract val start: Date
    abstract val finish: Date
}