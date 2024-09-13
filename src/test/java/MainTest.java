import org.junit.jupiter.api.Assertions;

class MainTest {

    @org.junit.jupiter.api.Test
    void testAdditionWorks() {
        double a = 3;
        double b = 1;
        Assertions.assertEquals(4, Main.addition(a, b));
    }

    @org.junit.jupiter.api.Test
    void testAdditionNegativeNumbers() {
        double a = -3;
        double b = -1;
        Assertions.assertEquals(-4, Main.addition(a, b));
    }

    @org.junit.jupiter.api.Test
    void testMinus(){
        double a = 3;
        double b = 1;
        Assertions.assertEquals(2, Main.minus(a, b));
    }

}