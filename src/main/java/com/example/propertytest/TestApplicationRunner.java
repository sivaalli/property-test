package com.example.propertytest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestApplicationRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(TestApplicationRunner.class);

    private final String myProperty;
    private final String myTestProperty;
    private final String myAnotherProperty;

    public TestApplicationRunner(@Value("${my.property}") String myProperty, @Value("${mc-oauth.client_id}") String myTestProperty,
                                 @Value("${my-test.sample}") String myAnotherProperty) {
        this.myProperty = myProperty;
        this.myTestProperty = myTestProperty;
        this.myAnotherProperty = myAnotherProperty;
    }

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
        logger.info("my.property is {}", myProperty);
        logger.info("mc-oauth.client_id is {}", myTestProperty);
        logger.info("my-test.sample is {}", myAnotherProperty);

    }
}
