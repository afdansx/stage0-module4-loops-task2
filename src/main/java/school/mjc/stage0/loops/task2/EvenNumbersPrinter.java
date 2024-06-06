package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int x = -2;
            while (x < printTillInclusive) {
                x++;
                x++;
                System.out.println(x);
            }
        }
    }
