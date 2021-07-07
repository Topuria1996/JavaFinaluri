package com.example.nodartopuria2.service;

import com.example.nodartopuria2.DTO.AddTaskDTO;
import com.example.nodartopuria2.DTO.DelTaskDTO;
import com.example.nodartopuria2.DTO.TaskDTO;


import java.util.List;

public interface TaskService {

    List<TaskDTO> getAll();

    void addTask(AddTaskDTO addTaskDTO);

    void delTask(DelTaskDTO delTaskDTO);
}
