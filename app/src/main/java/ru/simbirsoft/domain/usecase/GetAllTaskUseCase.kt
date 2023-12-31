package ru.simbirsoft.domain.usecase

import kotlinx.coroutines.flow.Flow
import ru.simbirsoft.domain.model.Task
import ru.simbirsoft.domain.repository.TaskRepository

class GetAllTaskUseCase(
    private val repository: TaskRepository,
) {
    operator fun invoke(): Flow<List<Task>>{
        return repository.findAll()
    }
}
