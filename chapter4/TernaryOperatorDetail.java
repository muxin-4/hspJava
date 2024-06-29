// 三元运算符细节
public class TernaryOperatorDetail {
    public static void main(String[] args) {
        int a = 3;
        int b = 8;
//        int c = a > b ? a : b; // 8
//        int c = a > b ? 1.1 : 3.4; // TernaryOperatorDetail.java:8: 错误: 不兼容的类型: 从double转换到int可能会有损失
//        int c = a > b ? (int)1.1 : (int)3.4; // 3
        double c = a > b ? a : b + 3; // int -> double 11.0
        System.out.println(c);
    }
}