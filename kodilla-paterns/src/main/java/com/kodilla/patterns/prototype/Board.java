package com.kodilla.patterns.prototype;

import java.util.HashSet;
import java.util.Set;

public final class Board extends Prototype {
    private String boardName;
    private Set<TasksList> lists = new HashSet<>();

    public Board(String boardName) {
        this.boardName = boardName;
    }

    public void setName(String boardName) {
        this.boardName = boardName;
    }

    public String getBoardName() {
        return boardName;
    }

    public Set<TasksList> getLists() {
        return lists;
    }

    @Override
    public String toString() {
        String s = "Board [" + boardName + "]\n";
        for(TasksList list : lists) {
            s = s + list.toString() + "\n";
        }
        return s;
    }

    public Board shallowCopy() throws CloneNotSupportedException {
        return (Board) super.clone();
    }

    public Board deepCopy() throws CloneNotSupportedException {
        Board cloneBoard = (Board) super.clone();
        cloneBoard.lists = new HashSet<>();
        for (TasksList theList : lists) {
            TasksList clonedList = new TasksList(theList.getTaskListName());
            for (Task task : theList.getTasks()) {
                clonedList.getTasks().add(task);
            }
            cloneBoard.getLists().add(clonedList);
        }
        return cloneBoard;
    }
}