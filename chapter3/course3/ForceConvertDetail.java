public class ForceConvertDetail {

    // 编写一个main方法
    public static void main(String[] args) {
        // 演示强制类型转换
        // 强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
        //int x = (int)10 * 3.5 + 6 * 1.5; // 编译错误：double -> int
        int y = (int)(10 * 3.5 + 6 * 1.5); // 44
        System.out.println(y);

        // char类型可以保存int的常量值，但不能保存int的变量值，需要强转
        char c1 = 100; // ok
        int m = 100; // ok
        // char c2 = m;
        char c3 = (char)m;
        System.out.println(c3);
    }
}