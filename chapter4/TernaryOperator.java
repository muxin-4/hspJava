// 三元运算符使用
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 99;
        int result = a > b ? a++ : b--;
        System.out.println(result); // 99
    }
}