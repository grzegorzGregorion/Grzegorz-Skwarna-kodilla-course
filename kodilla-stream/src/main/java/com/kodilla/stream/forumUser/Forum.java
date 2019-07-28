package com.kodilla.stream.forumUser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(1, "MaryL", 'f', 2001, 6, 23, 145));
        theForumUserList.add(new ForumUser(2, "TeoriaWszystkiego", 'M', 1968, 9, 2, 62));
        theForumUserList.add(new ForumUser(3, "JohnR", 'M', 1972, 12, 31, 1));
        theForumUserList.add(new ForumUser(4, "Bondy", 'F', 1999, 5, 30, 68));
        theForumUserList.add(new ForumUser(5, "MLucy", 'F', 1993, 2, 23, 2687));
        theForumUserList.add(new ForumUser(6, "Tanina", 'F', 1995, 6, 15, 658));
        theForumUserList.add(new ForumUser(7, "BigBoss", 'F', 2000, 10, 2, 123));
        theForumUserList.add(new ForumUser(8, "Smiley", 'F', 1967, 1, 6, 2154));
        theForumUserList.add(new ForumUser(9, "Terrence", 'M', 2000,7, 28, 85));
        theForumUserList.add(new ForumUser(10, "EarthPlanet", 'F', 2004, 11, 28, 14));
    }

    public List<ForumUser> getUsersList() {
        return new ArrayList<ForumUser>(theForumUserList);
    }
}
