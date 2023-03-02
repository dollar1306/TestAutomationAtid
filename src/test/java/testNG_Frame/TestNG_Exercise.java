package testNG_Frame;

import org.testng.annotations.*;

public class TestNG_Exercise {

    @BeforeClass
    public void openClass(){
        System.out.println("Run before all");
    }
    @AfterClass
    public void closeClass(){
        System.out.println("Run after all tests");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After method");
    }
    @Test
    public void test_1(){
        System.out.println("This is first test");
    }
    @Test
    public void test_2(){
        System.out.println("This is second test");
    }
}
