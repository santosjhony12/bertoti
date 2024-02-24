package com.apiToDoList.demo.service;

import com.apiToDoList.demo.entity.Task;
import com.apiToDoList.demo.exception.EntityNotFoundExcepition;
import com.apiToDoList.demo.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    @Transactional(readOnly = true)
    public List<Task> buscarTasks() {
        return taskRepository.findAll();
    }

    @Transactional
    public Task criarTask(Task task) {
        return taskRepository.save(task);
    }

    @Transactional(readOnly = true)
    public Optional<Task> buscarPorId(Long id){
        return taskRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundExcepition(String.format("Não foi possível encontrar a task com o id %s.", id));
        );
    }
    @Transactional
    public Task atualizar(Long id, Task task) {
        Task taskEncontrada  = taskRepository.getById(id);
        if(taskEncontrada != null){
            return
        }

        return

    }
}
