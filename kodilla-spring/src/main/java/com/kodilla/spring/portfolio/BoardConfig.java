package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    @Bean
    public Board board(TaskList tdl, TaskList inProgressList, TaskList doneList) {
        return new Board(tdl, inProgressList, doneList);
    }

    @Bean(name="tdl")
    public TaskList toDoList() {
        return new TaskList();
    }

    @Bean
    public TaskList inProgressList() {
        return new TaskList();
    }

    @Bean
    public TaskList doneList() {
        return new TaskList();
    }
}

