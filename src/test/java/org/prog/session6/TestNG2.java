package org.prog.session6;

import org.junit.jupiter.api.AfterAll;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG2 {

    @AfterSuite
    public void tearDown() {
        System.out.println("=============END==================");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    @Test
    public void test2() {
        System.out.println("1" + System.getProperty("paramValue"));
        System.out.println("Hello NG Tests 2!");
    }

    @Test
    public void test3() {
        System.out.println("2" + System.getProperty("paramValue"));
        System.out.println("Hello NG Tests 2!");
    }

    @Test
    public void test4() {
        System.out.println("3" + System.getProperty("paramValue"));
        System.out.println("Hello NG Tests 2!");
    }
}
