public class ForDetail {
    public static void main(String[] args) {

//        // 2.for(;循环条件;)中的初始化和变量迭代可以写到其它地方，但是两边的分号不能省略
//        int i = 1;
//        for (; i <= 10; ) {
//            System.out.println("你好，韩顺平" + i);
//            i++;
//        }
//
//        System.out.println("i=" + i); // 11
//
//        // 补充
//        for (; ; ) { // 这是无限循环，也就是死循环
//            System.out.println("ok~");
//        }


        // 3.循环初始值可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开，循环变量迭代也可以有多条变量迭代语句，中间用逗号隔开
        int count = 3;
        for (int i = 0, j = 0; i < count; i++, j += 2) {
            System.out.println("i=" + i + "j=" + j);
        }
        // i=0 j=0
        // i=1 j=2
        // i=2 j=4
    }
}