package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask("toDoTaskNo1");
        board.getInProgressList().addTask("inProgressTaskNo2");
        board.getDoneList().addTask("doneTaskNo3");
        //Then
        Assert.assertEquals(board.getToDoList().getTask(0), "toDoTaskNo1" );
        Assert.assertEquals(board.getInProgressList().getTask(0), "inProgressTaskNo2");
        Assert.assertEquals(board.getDoneList().getTask(0), "doneTaskNo3");
    }
}
