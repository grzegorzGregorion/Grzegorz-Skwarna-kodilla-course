package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTest(){
        System.out.println("This is just the beginning of all tests.");
    }

    @AfterClass
    public static void afterAllTest(){
        System.out.println("All tests are finished!");
    }

    @Before
    public void beforeEveryTest(){
        System.out.println("This is just the beginning of all tests.");
    }
    //test 1
    @Test
    public void testAddPost(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        //When
        forumUser.addPost("mrsmith", "Hello everyone, this is my first post!");
        //Then
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }
    //test 2
    @Test
    public void testAddComment(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first post here!", "mrsmith");
        //When
        forumUser.addComment(thePost, "mrsmith", "Thank for all posts of yours!");
        //Then
        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }
    //test 3
    @Test
    public void testGetPost(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first post here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //When
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);
        //Then
        Assert.assertEquals(thePost, retrievedPost);
    }
    //test 4
    @Test
    public void testGetComment(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first post here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thank You!");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        //When
        ForumComment retrievedComment = forumUser.getComment(0);
        //Then
        Assert.assertEquals(theComment, retrievedComment);
    }
    //test 5
    @Test
    public void testRemovePostNotExisting(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first post here!", "mrsmith");
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assert.assertFalse(result);
    }
    //test 6
    @Test
    public void testRemoveCommentNotExisting(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first post here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thank You!");
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assert.assertFalse(result);
    }
    //test 7
    @Test
    public void testRemovePost(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first post here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostsQuantity());
    }
    //test 8
    @Test
    public void testRemoveComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first post here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thank You!");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentsQuantity());
    }
}
