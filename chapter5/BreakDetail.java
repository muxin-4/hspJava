public class BreakDetail {
    public static void main(String[] args) {
//        abc1:
//        for (int j = 0; j < 4; j++) {
//            abc2:
//            for (int i = 0; i < 10; i++) {
//                if (i == 2) {
//                    break; // 等价break abc2
//                }
//                System.out.println("j=" + j + "i=" + i);
//            }
//        }

        /**
         * j=0i=0
         * j=0i=1
         * j=1i=0
         * j=1i=1
         * j=2i=0
         * j=2i=1
         * j=3i=0
         * j=3i=1
         */

        abc1:
        for (int j = 0; j < 4; j++) {
            abc2:
            for (int i = 0; i < 10; i++) {
                if (i == 2) {
                    break abc1; // 等价break abc2
                }
                System.out.println("j=" + j + "i=" + i);
            }
        }

        /**
         * j=0i=0
         * j=0i=1
         */

    }
}