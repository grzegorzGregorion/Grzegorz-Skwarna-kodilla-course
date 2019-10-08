package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "ListName: test list";
    private static final String DESCRIPTION = "Tasks: learn Hibernate";

    @Test
    public void testTaskListDaoSave() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);

        //When
        taskListDao.save(taskList);

        //Then
        int id = taskList.getId();
        Optional<TaskList> readTaskList = taskListDao.findById(id);
        Assert.assertTrue(readTaskList.isPresent());

        //CleanUp
       taskListDao.deleteById(id);
    }

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTaskLists = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, readTaskLists.size());

        //CleanUp
        int id = readTaskLists.get(0).getId();
        taskListDao.deleteById(id);
    }

    @Test
    public void testFindByDescription() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String description = taskList.getDescription();

        //When
        List<TaskList> readTaskLists = taskListDao.findByDescription(description);

        //Then
        Assert.assertEquals(1, readTaskLists.size());

        //CleanUp
        int id = readTaskLists.get(0).getId();
        taskListDao.deleteById(id);
    }
}