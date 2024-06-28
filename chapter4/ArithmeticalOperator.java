// 演示算术运算符的使用
public class ArithmeticalOperator {
    public static void main(String[] args) {
        // /使用
        System.out.println(10 / 4); // 数学结果是2.5，java输出为2 因为10和4都是整数，所以结果为整数
        System.out.println(10.0 / 4); // 数学结果是2.5，java输出为2.5 因为10.0是double类型，所以精度提升了，所以结果为小数

        double d = 10 / 4;
        System.out.println(d); // 2.0

        // % 取模，取余
        // %的本质，一个公式 a%b = a - a/b * b = 10 - 10 / (-3) * -3
        System.out.println(10 % 3); // 1
        System.out.println(-10 % 3); // -1
        System.out.println(10 % -3); // 1
        System.out.println(-10 % -3); // -10 - (-10/-3) * -3 = -1

        /**
         * 自增++
         * 作为独立语句使用，前++和后++都完全等价于i=i+1
         */
        // ++的使用
        int i = 10;
        i++; // 自增，等价于 i = i + 1;
        System.out.println("i=" + i);

        int j = 10;
        j++; // 自增，等价于 j = j + 1;
        System.out.println("j=" + j);

        int k = 10;
        k++; // 自增，等价于 k = k + 1; => k = 11
        ++k; // 自增，等价于 k = k + 1; => k = 12
        System.out.println("k=" + k);

        /**
         * 作为表达式使用
         * 前++：++i先自增再赋值
         * 后++：i++先赋值再自增
         */
        int m = 8;
        int n = ++m; // 等价 m = m + 1;n = m;
    }
}
