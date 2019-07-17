package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumPost;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        //When
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(15);
        when(statisticsMock.commentsCount()).thenReturn(45);
        //Then
        calculateStatistics.forumStatistics();
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
        //When
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(45);
        //Then
        calculateStatistics.forumStatistics();
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
        //When
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(45);
        //Then
        calculateStatistics.forumStatistics();
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
        //When
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(15);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //Then
        calculateStatistics.forumStatistics();
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
        //When
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(15);
        when(statisticsMock.commentsCount()).thenReturn(5);
        //Then
        calculateStatistics.forumStatistics();
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
        //When
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(15);
        when(statisticsMock.commentsCount()).thenReturn(60);
        //Then
        calculateStatistics.forumStatistics();
    }

    //test 7
    @Test
    public void testNoUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> listMock = new ArrayList<>();
        //When
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(15);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //Then
        calculateStatistics.forumStatistics();
    }

    //test 8
    @Test
    public void testUsersQnt100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> listMock = new ArrayList<>();
        for (int n = 0; n < 100; n++) {
            Random rdmIntNumber = new Random();
            String randomUserName = null;
            int stringLength = rdmIntNumber.nextInt(4);
            for (int k = 0; k < stringLength; k++) {
                randomUserName = k + "A";
            }
            listMock.add(randomUserName);
        }
        //When
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(15);
        when(statisticsMock.commentsCount()).thenReturn(68);
        //Then
        calculateStatistics.forumStatistics();
    }
}