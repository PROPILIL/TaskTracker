package com.propil.tasktracker.data.mapper

import com.propil.tasktracker.data.model.TaskDbModel
import com.propil.tasktracker.data.util.TaskFather
import com.propil.tasktracker.domain.entity.Task

class TaskMapper {

    fun mapEntityToDbModel(entity: Task) = TaskDbModel(
        id = entity.id,
        isDone = entity.isDone,
        title = entity.title,
        description = entity.description,
        start = entity.start,
        finish = entity.finish
    )

    fun mapDbModelToEntity(entity: TaskDbModel) = Task(
        id = entity.id,
        isDone = entity.isDone,
        title = entity.title,
        description = entity.description,
        start = entity.start,
        finish = entity.finish
    )

}