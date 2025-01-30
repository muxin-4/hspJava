public class ContinueDetail {
    public static void main(String[] args) {
//        label1:
//        for(int j = 0; j < 4; j++) {
//            label2:
//            for(int i = 0; i < 10; i++) {
//                if(i == 2) {
//                    // 看看分别输出什么值，并分析
//                     continue;
//                }
//                System.out.println("i = " + i);
//            }
//        }

        /**
         * i = 0
         * i = 1
         * i = 3
         * i = 4
         * i = 5
         * i = 6
         * i = 7
         * i = 8
         * i = 9
         * i = 0
         * i = 1
         * i = 3
         * i = 4
         * i = 5
         * i = 6
         * i = 7
         * i = 8
         * i = 9
         * i = 0
         * i = 1
         * i = 3
         * i = 4
         * i = 5
         * i = 6
         * i = 7
         * i = 8
         * i = 9
         * i = 0
         * i = 1
         * i = 3
         * i = 4
         * i = 5
         * i = 6
         * i = 7
         * i = 8
         * i = 9
         */

        label1:
        for(int j = 0; j < 4; j++) {
            label2:
            for(int i = 0; i < 10; i++) {
                if(i == 2) {
                    // 看看分别输出什么值，并分析
                    continue label2;
                }
                System.out.println("i = " + i);
            }
        }

        /**
         * i = 0
         * i = 1
         * i = 3
         * i = 4
         * i = 5
         * i = 6
         * i = 7
         * i = 8
         * i = 9
         * i = 0
         * i = 1
         * i = 3
         * i = 4
         * i = 5
         * i = 6
         * i = 7
         * i = 8
         * i = 9
         * i = 0
         * i = 1
         * i = 3
         * i = 4
         * i = 5
         * i = 6
         * i = 7
         * i = 8
         * i = 9
         * i = 0
         * i = 1
         * i = 3
         * i = 4
         * i = 5
         * i = 6
         * i = 7
         * i = 8
         * i = 9
         */

        label1:
        for(int j = 0; j < 4; j++) {
            label2:
            for(int i = 0; i < 10; i++) {
                if(i == 2) {
                    // 看看分别输出什么值，并分析
                    continue label1;
                }
                System.out.println("i = " + i);
            }
        }
        /**
         * i = 0
         * i = 1
         * i = 0
         * i = 1
         * i = 0
         * i = 1
         * i = 0
         * i = 1
         */
    }
}