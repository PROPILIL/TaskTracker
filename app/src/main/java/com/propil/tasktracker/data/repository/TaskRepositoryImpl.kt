package com.propil.tasktracker.data.repository

import com.propil.tasktracker.data.database.TaskDao
import com.propil.tasktracker.data.mapper.TaskMapper
import com.propil.tasktracker.data.model.TaskDbModel
import com.propil.tasktracker.domain.entity.Task
import com.propil.tasktracker.domain.logic.TaskRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class TaskRepositoryImpl @Inject constructor(
    private val mapper: TaskMapper,
    private val taskDao: TaskDao
): TaskRepository {


    override suspend fun addTask(task: Task) {
        val dbModel = mapper.mapEntityToDbModel(task)
        taskDao.addTask(dbModel)

    }

    override fun finishTask(task: Task) {
        TODO("Not yet implemented")
    }

    override fun deleteTask(task: Task) {
        TODO("Not yet implemented")
    }

    override fun editTask(task: Task) {
        TODO("Not yet implemented")
    }

    override suspend fun getTaskList(): Flow<List<Task>> {
        val entity = taskDao.getUnfinishedTaskList()

        return entity.map { list: List<TaskDbModel> ->
            list.map { item: TaskDbModel ->
                mapper.mapDbModelToEntity(item)
            }
        }
    }

    override fun getTask(taskId: Int): Task {
        TODO("Not yet implemented")
    }
}