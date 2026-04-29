package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {

    private static final Logger log = LoggerFactory.getLogger(MathUtils.class);

    public int add(int a, int b) {
        log.info("Adding {} and {}", a, b);
        return a + b;
    }

    public int divide(int a, int b) {
        log.info("Dividing {} by {}", a, b);

        if (b == 0) {
            log.error("Cannot divide by zero!");
            throw new IllegalArgumentException("b must not be 0");
        }

        return a / b;
    }
}