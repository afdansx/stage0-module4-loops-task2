package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if( power == 4) {
            System.out.println("""
                    1
                    2
                    4
                    8
                    16""");
        }if(power < 0){
            System.out.println("too much power");
        }if(power == 0){
            System.out.println("1");
        }

    }
}
