package curs1;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TestNgExample {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.err.println("test2");
        test3();
    }

    public void test3() {
        System.out.println("test3");
    }


    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

}
