package com.propil.tasktracker.domain.logic

import com.propil.tasktracker.domain.entity.Task
import javax.inject.Inject

class EditTaskUseCase @Inject constructor(val repository: TaskRepository) {

    operator fun invoke(task: Task) = repository.editTask(task)
}