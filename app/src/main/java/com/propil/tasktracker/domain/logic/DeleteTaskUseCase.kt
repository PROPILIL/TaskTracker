package com.propil.tasktracker.domain.logic

import com.propil.tasktracker.domain.entity.Task
import javax.inject.Inject

class DeleteTaskUseCase @Inject constructor(val repository: TaskRepository) {

    operator fun invoke(task: Task) = repository.deleteTask(task)
}