public class Homework {

    public static void main(String[] args) {
        TestProcessor.runTest(MyTest.class);
    }

    static class MyTest {
        @Test(order = -2)
        void firstTest() {
            System.out.println("firstTest запущен");
        }

        @Test
        void secondTest() {
            System.out.println("secondTest запущен");
        }

        @Test(order = 5)
        void thirdTest() {
            System.out.println("thirdTest запущен");
        }

        @Test(order = 6)
        @Skip
        void fourthTest() {
            System.out.println("fourthTest запущен");
        }

        @BeforeEach
        void beforeTestMethod() {
            System.out.println("beforeTestMethod запущен");
        }

        @AfterEach
        void afterTestMethos() {
            System.out.println("afterTestMethos запущен");
        }
    }
}