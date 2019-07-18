package com.kodilla.testing.forum.statistics;

import java.util.*;

public class CalculateStatistics {
    Statistics statistics;
    private double usersQuantity;
    private double forumPostsQuantity;
    private double forumCommentsQuantity;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public CalculateStatistics (Statistics statistics) {
        this.statistics = statistics;
    }

    public void forumStatistics() {
        Map<String, Double> forumStatistics = new HashMap<String, Double>();

        usersQuantity = statistics.usersNames().size();
        forumPostsQuantity = statistics.postsCount();
        forumCommentsQuantity = statistics.commentsCount();
        if (usersQuantity !=0) {
            avgPostsPerUser = forumPostsQuantity / usersQuantity;
        } else avgPostsPerUser = 0;
        if (usersQuantity != 0) {
            avgCommentsPerUser = forumCommentsQuantity / usersQuantity;
        } else avgCommentsPerUser = 0;
        if (forumPostsQuantity != 0) {
            avgCommentsPerPost = forumCommentsQuantity / forumPostsQuantity;
        } else avgCommentsPerPost = 0;

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

    public Statistics getStatistics() {
        return statistics;
    }

    public double getUsersQuantity() {
        return usersQuantity;
    }

    public double getForumPostsQuantity() {
        return forumPostsQuantity;
    }

    public double getForumCommentsQuantity() {
        return forumCommentsQuantity;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }
}