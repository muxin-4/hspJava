public class Return01 {
    public static void main(String[] args) {
//        for(int i = 1; i <=5; i++) {
//            if(i == 3) {
//                System.out.println("韩顺平" + i);
//                return;
//            }
//            System.out.println("Hello World!");
//        }
//        System.out.println("go on..");

        /**
         * Hello World!
         * Hello World!
         * 韩顺平3
         */

//        for(int i = 1; i <=5; i++) {
//            if(i == 3) {
//                System.out.println("韩顺平" + i);
//                break;
//            }
//            System.out.println("Hello World!");
//        }
//        System.out.println("go on..");

        /**
         * Hello World!
         * Hello World!
         * 韩顺平3
         * go on..
         */

        for(int i = 1; i <=5; i++) {
            if(i == 3) {
                System.out.println("韩顺平" + i);
                continue;
            }
            System.out.println("Hello World!");
        }
        System.out.println("go on..");

        /**
         * Hello World!
         * Hello World!
         * 韩顺平3
         * Hello World!
         * Hello World!
         * go on..
         */
    }
}