import java.util.Scanner;

public class DoWhileExercise02 {
    public static void main(String[] args) {
        /**
         * 4.如果李三不还钱，则老韩将一直使出五连鞭，知道老三说还钱为止
         */
        Scanner myScanner = new Scanner(System.in);
        char answer = ' ';
        do {
            System.out.println("如果李三不还钱，则老韩将一直使出五连鞭，知道老三说还钱为止");
            System.out.println("老韩问：还钱吗？y/n");
            answer = myScanner.next().charAt(0);
            System.out.println("他的回答是" + answer);
        } while (answer != 'y');

        System.out.println("李三还钱了");
    }
}