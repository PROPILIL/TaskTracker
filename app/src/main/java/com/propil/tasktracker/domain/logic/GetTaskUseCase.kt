package com.propil.tasktracker.domain.logic

import javax.inject.Inject

class GetTaskUseCase @Inject constructor(val repository: TaskRepository) {

    operator fun invoke(taskId: Int) = repository.getTask(taskId)
}