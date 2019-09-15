package com.kodilla.patterns.prototype;

import org.junit.Assert;
import org.junit.Test;
import java.util.stream.IntStream;

public class BoardTestSuite {
    @Test
    public void testToString() {
        //given
        //creating the TaskList for toDos
        TasksList toDoList = new TasksList("To Do Tasks");
        IntStream.iterate(1, n -> n+1)
                .limit(10)
                .forEach(n -> toDoList.getTasks().add(new Task("To Do Task name " + n)));

        //creating the TaskList for inProgress
        TasksList inProgressList = new TasksList("In Progress Tasks");
        IntStream.iterate(1, n -> n+1)
                .limit(10)
                .forEach(n -> inProgressList.getTasks().add(new Task("In progress task name " + n)));

        //creating the TaskList for done
        TasksList doneList = new TasksList("Done Tasks");
        IntStream.iterate(1, n -> n+1)
                .limit(10)
                .forEach(n -> doneList.getTasks().add(new Task("Done Task name " + n)));

        //creating the board and assigning the list
        Board board = new Board("Project no 1");
        board.getLists().add(toDoList);
        board.getLists().add(inProgressList);
        board.getLists().add(doneList);

        //making a shallow clone of object board
        Board cloneBoard = null;
        try {
            cloneBoard = board.shallowCopy();
            cloneBoard.setName("Project no 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Board deepClonedBoard = null;
        try {
            deepClonedBoard = board.deepCopy();
            deepClonedBoard.setName("Project no 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        board.getLists().remove(toDoList);
        //Then
        System.out.println(board);
        System.out.println(cloneBoard);
        System.out.println(deepClonedBoard);
        Assert.assertEquals(2, board.getLists().size());
        Assert.assertEquals(2, cloneBoard.getLists().size());
        Assert.assertEquals(3, deepClonedBoard.getLists().size());
        Assert.assertEquals(board.getLists().size(), cloneBoard.getLists().size());
        Assert.assertNotEquals(deepClonedBoard.getLists(), board.getLists());

    }
}
