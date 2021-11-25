package curs2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DependencyExample {

    @Test()
    public void one(){
        assertTrue(false);
        System.out.println("First");
    }

    @Test(dependsOnMethods = {"one"})
    public void two(){
        System.out.println("Second");
    }

    @Test(dependsOnMethods = {"one"})
    public void three(){
        System.out.println("Third");
    }

}
