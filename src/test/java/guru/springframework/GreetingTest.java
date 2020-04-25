package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

    Greeting greeting;

    @BeforeAll
    static void beforeAll() {
        System.out.println("In the BeforeAll...");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before Each...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld("Pask"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In the AfterEach...");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("In the AfterAll...");
    }
}