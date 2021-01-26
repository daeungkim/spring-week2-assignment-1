package com.codesoom.assignment.controllers;

import com.codesoom.assignment.models.Task;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private List<Task> tasks = new ArrayList<>();
    private Long newId = 0L;

    @GetMapping
    public List<Task> list() {
        return tasks;
    }

    @PostMapping
    public Task create(@RequestBody Task task) {
        task.setId(generateId());
        tasks.add(task);
        return task;
    }

//    public Task update(@RequestBody Task task)
//    {
//        task.setTitle(task.getTitle());
//        return task;
//    }
//    public Task delete(@RequestBody Task task)
//    {
//        tasks.remove(task);
//        return task;
//    }

    private Long generateId() {
        newId++;
        return newId;
    }


}
