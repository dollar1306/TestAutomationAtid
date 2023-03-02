package testNG_Frame;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGFrame
{
    @BeforeClass
    public void openSession()
    {
        System.out.println("Run before a test");
    }
    @AfterClass
    public void closeSession()
    {
        System.out.println("Run after a test");
    }
    @Test
    public void test01()
    {
        System.out.println("test-1");
    }
    @Test
    public void test02()
    {
        System.out.println("test-2");
    }
}
