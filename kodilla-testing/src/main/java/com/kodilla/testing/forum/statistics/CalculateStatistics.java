package com.kodilla.testing.forum.statistics;

import java.util.*;

public class CalculateStatistics {
    Statistics statistics;

    public CalculateStatistics (Statistics statistics) {
        this.statistics = statistics;
    }

    public void forumStatistics() {

        Map<String, Double> forumStatistics = new HashMap<String, Double>();

        double usersQuantity = statistics.usersNames().size();
        double forumPostsQuantity = statistics.postsCount();
        double forumCommentsQuantity = statistics.commentsCount();
        double avgPostsPerUser = forumPostsQuantity / usersQuantity;
        double avgCommentsPerUser = forumCommentsQuantity / usersQuantity;
        double avgCommentsPerPost = forumCommentsQuantity / forumPostsQuantity;

        forumStatistics.put("Users quantity: ", usersQuantity);
        forumStatistics.put("Forum posts quantity: ", forumPostsQuantity);
        forumStatistics.put("Forum comments quantity: ", forumCommentsQuantity);
        forumStatistics.put("Average posts per user: ", avgPostsPerUser);
        forumStatistics.put("Average comments per user: ", avgCommentsPerUser);
        forumStatistics.put("Average comments per post: ", avgCommentsPerPost);

        for (Map.Entry<String, Double> stat: forumStatistics.entrySet()) {
            System.out.println(stat.getKey() + stat.getValue());
        }
    }
}