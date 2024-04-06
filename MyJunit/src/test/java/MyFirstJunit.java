import org.junit.*;

public class MyFirstJunit {
    @Before
    public void preConditions() {
        System.out.println("Pre conditions.");
    }

    @After
    public void postActions() {
        System.out.println("Post Actions.");
    }

    @BeforeClass
    public static void testSuiteBefore() {
        System.out.println("Initial setup...");
    }

    @AfterClass
    public static void testSuiteAfter() {
        System.out.println("Post Completion...");
    }

    @Test
    public void test1() {
        System.out.println("Test1 is executing.....");

        int actualValue = 10;
        int expectedValue = 10;
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void test2() {
        System.out.println("Test2 is executing.....");
    }
}
