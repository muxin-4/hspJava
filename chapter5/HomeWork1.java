
public class HomeWork1 {

    public static void main(String[] args) {
        /**
         * 1.编程实现如下功能 某人有100，000元，每次经过一次路口，需要交费，规则如下： 1）当现金>50000时，每次交5%
         * 2）当现金<=50000时，每次交1000 编程计算该人可以经过多少次路口,要求：使用 while break方式完成
         */

        int sum = 0;
        double money = 100000;

        while (true) {
            if (money > 50000) {
                money = money * (1 - 0.05);
                sum++;
            }
            if (money <= 50000) {
                money = money - 1000;
                sum++;
                if (money - 1000 < 0) {
                    break;
                }
            }
        }

        System.out.println("sum=" + sum);
    }

}
