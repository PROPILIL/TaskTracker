package com.propil.tasktracker.domain.logic

import com.propil.tasktracker.domain.entity.Task
import javax.inject.Inject

interface TaskRepository {

    fun addTask(task: Task)

    fun finishTask(task: Task)

    fun deleteTask(task: Task)

    fun editTask(task: Task)

    fun getTaskList(): List<Task>

    fun getTask(taskId: Int): Task



}