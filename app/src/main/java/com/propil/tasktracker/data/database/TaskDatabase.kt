package com.propil.tasktracker.data.database

import android.app.Application
import androidx.room.AutoMigration
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.propil.tasktracker.data.model.TaskDbModel

@Database(entities = [TaskDbModel::class], version = 1,
autoMigrations = [AutoMigration(from = 1, to = 2)], exportSchema = true)
@TypeConverters(TaskConverter::class)
abstract class TaskDatabase: RoomDatabase() {

    abstract fun TaskDao(): TaskDao

    companion object {

        private var INSTANCE: TaskDatabase? = null
        private const val DB_NAME = "Task.db"
        private val LOCK = Any()

        //TODO: Move it into di/DataModule
        fun getInstance(application: Application): TaskDatabase {
            INSTANCE?.let {
                return it
            }
            synchronized(LOCK) {
                INSTANCE?.let{
                    return it
                }
            }
            val db = Room.databaseBuilder(
                application,
                TaskDatabase::class.java,
                DB_NAME
            ).build()
            INSTANCE = db
            return db
        }
    }
}