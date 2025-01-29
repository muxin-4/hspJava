public class Stars {
    public static void main(String[] args) {
        /**
         *       *
         *      ***
         *     *****
         *    ********
         *
         * 思路分析
         * 1.先打印矩形
         * *****
         * *****
         * *****
         * *****
         * *****
         *
         * 2.打印半个金字塔
         * *
         * **
         * ***
         * ****
         * *****
         *
         * 3.打印整个金字塔
         *    *
         *   ***
         *  *****
         * *******
         *
         * 4.打印空心的金字塔
         *    *
         *   * *
         *  *   *
         * *******
         */

//        1.先打印矩形
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("*****");
//        }


        // 2.打印半个金字塔
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

        // 3.打印整个金字塔
//        for (int i = 1; i <= 5; i++) {
//            // 在输出*之前，还要输出空格
//            for (int k = 1; k <= 5 - i; k++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        // 4.打印空心的金字塔
        for (int i = 1; i <= 5; i++) {
            // 在输出*之前，还要输出空格
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                // 当前行的第一行位置是*，最后一个位置也是*，最后一层全部是*
                if (j == 1 || j == 2 * i - 1 || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}