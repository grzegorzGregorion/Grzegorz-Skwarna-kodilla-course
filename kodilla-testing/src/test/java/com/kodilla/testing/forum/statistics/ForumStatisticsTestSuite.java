package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumPost;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTest() {
        System.out.println("This is the beginning of all tests.");
    }

    @AfterClass
    public static void afterAllTest() {
        System.out.println("All tests are finished!");
    }

    @Before
    public void beforeEveryTest() {
        System.out.println("Next test starts.");
    }

    //test 1
    @Test
    public void initialTestWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> listMock = new ArrayList<>();
        listMock.add("Ab");
        listMock.add("Ba");
        listMock.add("Cf");
        listMock.add("Gh");
        listMock.add("Bg");

        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(15);
        when(statisticsMock.commentsCount()).thenReturn(45);
        //When
        calculateStatistics.forumStatistics();
        //Then
        Assert.assertEquals(5, calculateStatistics.getUsersQuantity(),3);
        Assert.assertEquals(15, calculateStatistics.getForumPostsQuantity(),3);
        Assert.assertEquals(45, calculateStatistics.getForumCommentsQuantity(),3);
        Assert.assertEquals(3, calculateStatistics.getAvgPostsPerUser(),3);
        Assert.assertEquals(9, calculateStatistics.getAvgCommentsPerUser(),3);
        Assert.assertEquals(3, calculateStatistics.getAvgCommentsPerPost(),3);
    }

    //test 2
    @Test
    public void testPostQuantity0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> listMock = new ArrayList<>();
        listMock.add("Ab");
        listMock.add("Ba");
        listMock.add("Cf");
        listMock.add("Gh");
        listMock.add("Bg");

        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(45);
        //When
        calculateStatistics.forumStatistics();
        //Then
        Assert.assertEquals(5, calculateStatistics.getUsersQuantity(),3);
        Assert.assertEquals(0, calculateStatistics.getForumPostsQuantity(),3);
        Assert.assertEquals(45, calculateStatistics.getForumCommentsQuantity(),3);
        Assert.assertEquals(0, calculateStatistics.getAvgPostsPerUser(),3);
        Assert.assertEquals(9, calculateStatistics.getAvgCommentsPerUser(),3);
        Assert.assertEquals(Infinity, calculateStatistics.getAvgCommentsPerPost(),3);
    }

    //test 3
    @Test
    public void testPostQuantity1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> listMock = new ArrayList<>();
        listMock.add("Ab");
        listMock.add("Ba");
        listMock.add("Cf");
        listMock.add("Gh");
        listMock.add("Bg");

        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(45);
        //When
        calculateStatistics.forumStatistics();
        //Then
        Assert.assertEquals(5, calculateStatistics.getUsersQuantity(),3);
        Assert.assertEquals(1000, calculateStatistics.getForumPostsQuantity(),3);
        Assert.assertEquals(45, calculateStatistics.getForumCommentsQuantity(),3);
        Assert.assertEquals(200, calculateStatistics.getAvgPostsPerUser(),3);
        Assert.assertEquals(9, calculateStatistics.getAvgCommentsPerUser(),3);
        Assert.assertEquals(45/1000, calculateStatistics.getAvgCommentsPerPost(),3);
    }

    //test 4
    @Test
    public void testCommentsQuantity0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> listMock = new ArrayList<>();
        listMock.add("Ab");
        listMock.add("Ba");
        listMock.add("Cf");
        listMock.add("Gh");
        listMock.add("Bg");

        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(15);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        calculateStatistics.forumStatistics();
        //Then
        Assert.assertEquals(5, calculateStatistics.getUsersQuantity(), 2);
        Assert.assertEquals(15, calculateStatistics.getForumPostsQuantity(), 2);
        Assert.assertEquals(0, calculateStatistics.getForumCommentsQuantity(), 2);
        Assert.assertEquals(3, calculateStatistics.getAvgPostsPerUser(), 2);
        Assert.assertEquals(0, calculateStatistics.getAvgCommentsPerUser(), 2);
        Assert.assertEquals(0, calculateStatistics.getAvgCommentsPerPost(), 2);
    }

    //test 5
    @Test
    public void testCommentsQntLessThenPostQnt() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> listMock = new ArrayList<>();
        listMock.add("Ab");
        listMock.add("Ba");
        listMock.add("Cf");
        listMock.add("Gh");
        listMock.add("Bg");

        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(15);
        when(statisticsMock.commentsCount()).thenReturn(5);
        //When
        calculateStatistics.forumStatistics();
        //Then
        Assert.assertEquals(5, calculateStatistics.getUsersQuantity(),3);
        Assert.assertEquals(15, calculateStatistics.getForumPostsQuantity(),3);
        Assert.assertEquals(5, calculateStatistics.getForumCommentsQuantity(),3);
        Assert.assertEquals(3, calculateStatistics.getAvgPostsPerUser(),3);
        Assert.assertEquals(1, calculateStatistics.getAvgCommentsPerUser(),3);
        Assert.assertEquals(5/15, calculateStatistics.getAvgCommentsPerPost(),3);
    }

    //test 6
    @Test
    public void testCommentsQntHigherThenPostQnt() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> listMock = new ArrayList<>();
        listMock.add("Ab");
        listMock.add("Ba");
        listMock.add("Cf");
        listMock.add("Gh");
        listMock.add("Bg");

        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(15);
        when(statisticsMock.commentsCount()).thenReturn(60);
        //When
        calculateStatistics.forumStatistics();
        //Then
        Assert.assertEquals(5, calculateStatistics.getUsersQuantity(),3);
        Assert.assertEquals(15, calculateStatistics.getForumPostsQuantity(),3);
        Assert.assertEquals(60, calculateStatistics.getForumCommentsQuantity(),3);
        Assert.assertEquals(3, calculateStatistics.getAvgPostsPerUser(),3);
        Assert.assertEquals(12, calculateStatistics.getAvgCommentsPerUser(),3);
        Assert.assertEquals(4, calculateStatistics.getAvgCommentsPerPost(),3);
    }

    //test 7
    @Test
    public void testNoUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> listMock = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(15);
        when(statisticsMock.commentsCount()).thenReturn(15);
        //When
        calculateStatistics.forumStatistics();
        //Then
        Assert.assertEquals(0, calculateStatistics.getUsersQuantity(),3);
        Assert.assertEquals(15, calculateStatistics.getForumPostsQuantity(),3);
        Assert.assertEquals(15, calculateStatistics.getForumCommentsQuantity(),3);
        Assert.assertEquals(Infinity, calculateStatistics.getAvgPostsPerUser(),3);
        Assert.assertEquals(Infinity, calculateStatistics.getAvgCommentsPerUser(),3);
        Assert.assertEquals(1, calculateStatistics.getAvgCommentsPerPost(),3);
    }

    //test 8
    @Test
    public void testUsersQnt1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> listMock = new ArrayList<>();
        for (int n = 0; n < 1000; n++) {
            Random rdmIntNumber = new Random();
            String randomUserName = null;
            int stringLength = rdmIntNumber.nextInt(4);
            for (int k = 0; k < stringLength; k++) {
                randomUserName = k + "A";
            }
            listMock.add(randomUserName);
        }

        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(15);
        when(statisticsMock.commentsCount()).thenReturn(68);
        //When
        calculateStatistics.forumStatistics();
        //Then
        Assert.assertEquals(1000, calculateStatistics.getUsersQuantity(),3);
        Assert.assertEquals(15, calculateStatistics.getForumPostsQuantity(),3);
        Assert.assertEquals(68, calculateStatistics.getForumCommentsQuantity(),3);
        Assert.assertEquals(15/1000, calculateStatistics.getAvgPostsPerUser(),3);
        Assert.assertEquals(68/1000, calculateStatistics.getAvgCommentsPerUser(),3);
        Assert.assertEquals(68/15, calculateStatistics.getAvgCommentsPerPost(),3);
    }
}