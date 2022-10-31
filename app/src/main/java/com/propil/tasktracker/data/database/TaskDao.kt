package com.propil.tasktracker.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.propil.tasktracker.data.model.TaskDbModel
import com.propil.tasktracker.domain.entity.Task
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addTask(taskDbModel: TaskDbModel)

    @Query("SELECT * FROM tasks")
    fun getUnfinishedTaskList(): Flow<List<TaskDbModel>>
//
//    @Query("SELECT * FROM tasks")
//    suspend fun getFinishedTaskList(): Flow<List<TaskDbModel>>
}