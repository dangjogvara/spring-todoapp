package com.dangjogvara.todoapp.controllers;

import com.dangjogvara.todoapp.model.Todo;
import com.dangjogvara.todoapp.repositories.TodoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    private final TodoRepository todoRepository;


    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @GetMapping("/todos")
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }
}
