package com.example.nodartopuria2.serviceImpl;

import com.example.nodartopuria2.DTO.AddTaskDTO;
import com.example.nodartopuria2.DTO.DelTaskDTO;
import com.example.nodartopuria2.DTO.TaskDTO;
import com.example.nodartopuria2.model.Task;
import com.example.nodartopuria2.repository.TaskRepository;
import com.example.nodartopuria2.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private  TaskRepository taskRepository;

    @Override
    public List<TaskDTO> getAll() {
        List<Task> taskList = taskRepository.findAll();
        List<TaskDTO> taskDTOList = new ArrayList<>();
        if(taskList.isEmpty()){
            Task t = new Task();
            t.setTitle("asda");
            t.setDescription("asdasdasdas");
            t.setStartDate(new Date());
            t.setEndDate(new Date());
            taskRepository.save(t);
        }
        return getTaskDTOS(taskDTOList);
    }

    private List<TaskDTO> getTaskDTOS(List<TaskDTO> taskDTOList) {
        List<Task> taskList = taskRepository.findAll();
        for (Task m : taskList) {
            TaskDTO taskDTO = new TaskDTO();
            taskDTO.setDesc(m.getDescription());
            taskDTO.setTitle(m.getTitle());
            taskDTO.setId(m.getId());
            taskDTO.setStartDate(m.getStartDate());
            taskDTO.setEndDate(m.getEndDate());
            taskDTOList.add(taskDTO);
        }
        return taskDTOList;
    }

    @Override
    public void addTask(AddTaskDTO addTaskDTO) {
        Task task = new Task();
        task.setTitle(addTaskDTO.getTitle());
        task.setDescription(addTaskDTO.getDesc());
        task.setStartDate(addTaskDTO.getStartDate());
        task.setEndDate(addTaskDTO.getEndDate());
        taskRepository.save(task);
    }

    @Override
    public void delTask(DelTaskDTO delTaskDTO) {
        taskRepository.deleteById(delTaskDTO.getId());
    }
}
