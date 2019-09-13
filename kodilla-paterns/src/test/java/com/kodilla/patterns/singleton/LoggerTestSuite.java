package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void testLog() {
        System.out.println("Test beginning");
        Logger.getInstance().log("Last log 00:03:03 time");
    }

    @Test
    public void testLoggerGetLasLog() {
        //Given
        //When
        String result = Logger.getInstance().getLastLog();
        //
        Assert.assertEquals("Last log 00:03:03 time", result);
    }

}
