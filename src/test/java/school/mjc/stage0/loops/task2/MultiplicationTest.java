package school.mjc.stage0.loops.task2;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

class MultiplicationTest extends BaseIOTest {

    @Test
    void printMultipliedPositive() {
        Multiplication multiplication = new Multiplication();

        multiplication.printMultiplied(5);

        assertOutEquals("0\n5\n10\n15\n20\n25\n");
    }
}