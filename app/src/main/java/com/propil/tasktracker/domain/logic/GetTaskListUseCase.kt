package com.propil.tasktracker.domain.logic

import com.propil.tasktracker.domain.entity.Task
import javax.inject.Inject

class GetTaskListUseCase @Inject constructor(val repository: TaskRepository) {

    operator fun invoke() = repository.getTaskList()
}