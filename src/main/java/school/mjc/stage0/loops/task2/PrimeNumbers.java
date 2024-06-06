package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int x = 0;
        while (x <= printToInclusive) {
            if (printToInclusive == 0) {
                break;
            }
            x++;
            x++;
            System.out.println(x);
            if (x == 2) {
                x++;
                System.out.println(x);
            } if (x == 7) {
                    x++;
                    x++;
                    x++;
                    x++;
                    System.out.println(x);
                }
                if (x == 13) {
                    x++;
                    x++;
                    x++;
                    x++;
                    System.out.println(x);
                }
                if (x == 19) {
                    x++;
                    x++;
                    x++;
                    x++;
                    System.out.println(x);
                } if (x == 23) {
                    x++;
                    x++;
                    x++;
                    x++;
                    x++;
                    x++;
                    System.out.println(x);
                }
            if(x == 31){
                break;
            }
        }
    }
}
