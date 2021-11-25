package curs2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample {

    @Test()
    public void softAssertion(){
        SoftAssert softAssert = new SoftAssert();

        System.out.println("Before assert");
        softAssert.assertTrue(false);
        System.out.println("After assert");

        softAssert.assertAll();
    }




}
