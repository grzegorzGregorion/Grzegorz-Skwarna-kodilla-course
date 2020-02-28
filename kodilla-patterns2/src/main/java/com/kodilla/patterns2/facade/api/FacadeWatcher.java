package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class FacadeWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..)) && target(targetObj) && args(orderDtoObj, userIdObj)")
    public void logEventBefore(Object targetObj, OrderDto orderDtoObj, Long userIdObj) {
        LOGGER.info("The Facade processOrder is going to be processed\nTarget object: " + targetObj.getClass().getName()
                + "\nOrderDtoObj: " + orderDtoObj
                + "\nUserIdObj: " + userIdObj);
    }

    @After("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..)) && target(targetObj)")
    public void logEventAfter(Object targetObj) {
        LOGGER.info("The Facade processOrder has been processed without errors" +
                "\nTarget object: " + targetObj.getClass().getName());
    }
}
