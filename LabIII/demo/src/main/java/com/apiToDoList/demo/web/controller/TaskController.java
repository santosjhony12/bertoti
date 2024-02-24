package com.apiToDoList.demo.web.controller;

import com.apiToDoList.demo.entity.Task;
import com.apiToDoList.demo.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("tasks")
public class TaskController {
    private final TaskService taskService;

    @GetMapping
    public ResponseEntity<List<Task>> getTaks(){
        return ResponseEntity.ok().body(taskService.buscarTasks());
    }

    @PostMapping
    public ResponseEntity<Task> create(@RequestBody Task task){
        return ResponseEntity.status(HttpStatus.CREATED).body(taskService.criarTask(task));
    }

    @PutMapping("{id}")
    public ResponseEntity<Task> update(@PathVariable Long id, @RequestBody Task task){

        return ResponseEntity.ok().body(taskService.atualizar(task));
    }
}
