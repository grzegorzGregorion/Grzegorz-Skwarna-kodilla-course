package com.kodilla.patterns2.aop.calculator;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Aspect
public class Watcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(Watcher.class);

    @Before("execution(* com.kodilla.patterns2.aop.calculator.Calculator.factorial(..)) && args(theNumber) && target(obj)")
    public void logEvent(BigDecimal theNumber, Object obj) {
        LOGGER.info("\nLogging the event: \n" + "ClassName: " + obj.getClass().getName() + "\nArgs: " + theNumber);
    }
}
