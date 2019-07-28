package com.kodilla.stream;

import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theMapOfForumUser = theForum.getUsersList().stream()
                .filter(user -> user.getUserSex() == 'M')
                .filter(user -> user.getPostPublicated() > 0)
                .filter(user -> user.getBirthDate().getYear() <= (LocalDate.now().getYear()-20))
                .collect(Collectors.toMap(ForumUser::getIdNumber, user -> user));

        System.out.println(theMapOfForumUser);
    }
}
