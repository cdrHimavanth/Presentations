package com.tdd.demo;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class DemoTest {
    static int[] ints ;
    @BeforeAll
    static void setUpAll() {
        // Perform setup operations once before all test methods
        ints= new int[]{1, 2, 3, 4};
    }

    @AfterAll
    static void tearDownAll() {
        // Perform cleanup operations once after all test methods
        ints=null;
    }
    @BeforeEach
    void setUp() {
        // Perform setup operations before each test method
    }

    @AfterEach
    void tearDown() {

        // Perform cleanup operations after each test method
    }
    @Test
    void myTestMethod() {
        double a, b,c;
        a = 3/0;
        b = 0/4;
        c=0/0;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int result = 2 + 2;
        assertEquals(4, result);
    }
    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void myParameterizedTestMethod(int number) {
        assertTrue(number > 0 && number < 4);
    }
    @RepeatedTest(10)
    void myRepeatedTestMethod() {
        int randomNumber = (int) (Math.random() * 100);
        assertNotEquals(33, randomNumber);
    }
    @Test
    @DisplayName("Custom Test Name")
    void myTestMethod2() {
        String text = "JUnit 5";
        assertTrue(text.contains("JUnit"));
    }
    @Disabled("This test is disabled for now")
    @Test
    void myDisabledTestMethod() {
        // This test will be ignored during test execution
//        assertEquals(1,0);
    }
    @Test
    void myTimeoutTestMethod() {
        assertTimeout(Duration.ofSeconds(1), () -> {
            // Perform some time-consuming task
//            TimeUnit.SECONDS.sleep(1);
        });
    }
    @Nested
    class NestedTestClass {
        @Test
        void myNestedTestMethod() {
            String text = "JUnit 5";
            assertTrue(text.contains("JUnit"));
        }
        @Test
        void myNestedTestMethod2() {
            String text = "JUnit 5";
            assertTrue(text.contains("JUnit 5"));
        }
    }

}
