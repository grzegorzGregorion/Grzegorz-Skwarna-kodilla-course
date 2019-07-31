package com.kodilla.stream.portfolio;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.util.stream.Collectors.toList;

public class BoardTestSuite {
    public Board prepareTestData() {
        //
        User user1 = new User("developer1", "John Smith");
        User user2 = new User("projectManager1", "Nina White");
        User user3 = new User("developer2", "Emilia Stephanson");
        User user4 = new User("developer3", "Konrad Bridge");

        //
        Task task1 = new Task("Microservice for taking temperature",
                "Write and test the microservice taking\n" +
                        "the temperaure from external service",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(30), 1);
        Task task2 = new Task("HQLs for analysis",
                "Prepare some HQL queries for analysis",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(5), 2);
        Task task3 = new Task("Temperatures entity",
                "Prepare entity for temperatures",
                user3,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(15), 3);
        Task task4 = new Task("Own logger",
                "Refactor company logger to meet our needs",
                user3,
                user2,
                LocalDate.now().minusDays(10),
                LocalDate.now().plusDays(25), 4);
        Task task5 = new Task("Optimize searching",
                "Archive data searching has to be optimized",
                user4,
                user2,
                LocalDate.now(),
                LocalDate.now().plusDays(5), 5);
        Task task6 = new Task("Use Streams",
                "use Streams rather than for-loops in predictions",
                user4,
                user2,
                LocalDate.now().minusDays(15),
                LocalDate.now().minusDays(2), 6);

        //
        TaskList taskListToDo = new TaskList("To do");
        taskListToDo.addTask(task1);
        taskListToDo.addTask(task3);

        TaskList taskListInProgress = new TaskList("In progress");
        taskListInProgress.addTask(task2);
        taskListInProgress.addTask(task4);
        taskListInProgress.addTask(task5);

        TaskList taskListDone = new TaskList("Done");
        taskListDone.addTask(task6);

        //
        Board project = new Board("Project: Weather Prediction");
        project.addTaskList(taskListToDo);
        project.addTaskList(taskListInProgress);
        project.addTaskList(taskListDone);

        return project;
    }

    //Test1
    @Test
    public void testAddTaskList() {
        //Given
        Board project = prepareTestData();
        //When

        //Then
        Assert.assertEquals(3, project.getTaskLists().size());
    }

    //Test1
    @Test
    public void testAddTaskListFindUsersTasks() {
        //Given
        Board project = prepareTestData();


        //When
        User user = new User("developer1", "John Smith");
        List<Task> tasks = project.getTaskLists().stream()
                .flatMap(l -> l.getTasks().stream())
                .filter(n -> n.getAssignedUser().equals(user))
                .collect(toList());

        //Then
        Assert.assertEquals(2, tasks.size());
        Assert.assertEquals(user, tasks.get(0).getAssignedUser());
        Assert.assertEquals(user, tasks.get(1).getAssignedUser());
    }

    //Test 3
    @Test
    public void testAddTaskListFindOutdatedTasks() {
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> undoneTasks = new ArrayList<>();
        undoneTasks.add(new TaskList("To do"));
        undoneTasks.add(new TaskList("In progress"));
        List<Task> tasks = project.getTaskLists().stream()
                .filter(undoneTasks::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .filter(t -> t.getDeadLine().isBefore(LocalDate.now()))
                .collect(toList());

        //Then
        Assert.assertEquals(1, tasks.size());
        Assert.assertEquals("HQLs for analysis", tasks.get(0).getTitle());
    }

    //Test4
    @Test
    public void testAddTaskListFindLongTasks () {
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> inProgressTasks = new ArrayList<>();
        inProgressTasks.add(new TaskList("In progress"));
        long longTasks = project.getTaskLists().stream()
                .filter(inProgressTasks::contains)
                .flatMap(lt -> lt.getTasks().stream())
                .map(t -> t.getCreated())
                .filter(d -> d.compareTo(LocalDate.now().minusDays(10)) <= 0)
                .count();

        //Then
        Assert.assertEquals(2, longTasks);
    }

    //Test5
    @Test
    public void testAddTaskListAverageWorkingOnTaskWithoutIntStream () {
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> inProgressTasks = new ArrayList<>();
        inProgressTasks.add(new TaskList("In progress"));
        long longTasks = project.getTaskLists().stream()
                .filter(inProgressTasks::contains)
                .flatMap(lt -> lt.getTasks().stream())
                .map(t -> t.getCreated())
                .count();

        long longTasksWorkingDays = project.getTaskLists().stream()
                .filter(inProgressTasks::contains)
                .flatMap(lt -> lt.getTasks().stream())
                .map(t -> DAYS.between(t.getCreated(), LocalDate.now()))
                .reduce((long) 0, (sum, current) -> sum = sum + current);

        long averageWorkingOnTask = longTasksWorkingDays/longTasks;

        //Then
        Assert.assertEquals(10, averageWorkingOnTask);
    }

/*    //Test6
    @Test
    public void testAddTaskListAverageWorkingOnTaskWithIntStream () {
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> inProgressTasks = new ArrayList<>();
        inProgressTasks.add(new TaskList("In progress"));

        //Then
        Assert.assertEquals(133, averageValue);
        System.out.println(averageValue);
    }*/
}
