package com.propil.tasktracker.domain.logic

import com.propil.tasktracker.domain.entity.Task
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

interface TaskRepository {

    suspend fun addTask(task: Task)

    fun finishTask(task: Task)

    fun deleteTask(task: Task)

    fun editTask(task: Task)

    suspend fun getTaskList(): Flow<List<Task>>

    fun getTask(taskId: Int): Task



}