package com.example.nodartopuria2.controller;

import com.example.nodartopuria2.DTO.AddTaskDTO;
import com.example.nodartopuria2.DTO.DelTaskDTO;
import com.example.nodartopuria2.DTO.TaskDTO;
import com.example.nodartopuria2.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/tasks")
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping("/getAllTasks")
    public List<TaskDTO> getMovies() {
        return service.getAll();
    }

    @PostMapping("/addTask")
    public void addMovie(AddTaskDTO addTaskDTO) {
        service.addTask(addTaskDTO);
    }

    @DeleteMapping
    public void delMovie(DelTaskDTO delTaskDTO) {
        service.delTask(delTaskDTO);
    }

}
