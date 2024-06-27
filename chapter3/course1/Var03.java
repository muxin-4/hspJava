public class Var03 {

    // 编写一个main方法
    public static void main(String[] args) {
        // 变量必须先声明，后使用，即有顺序
        int a = 50;
        System.out.println(a); // 50

        // 该区域的数据/值可以在同一类型范围内不断变化
        // a = "jack"; // Var03.java:10: 错误: 不兼容的类型: String无法转换为int
        a = 88;
        System.out.println(a); // 88

        //  变量在同一个作用域内不能重名
        // int a = 77; // Var03.java:14: 错误: 已在方法 main(String[])中定义了变量 a
    }
}

class Dog {
    public static void main(String[] args) {
        int a = 999;
    }
}