import java.util.Scanner;

public class input {

    // 编写一个main方法
    public static void main(String[] args) {
        // 演示接受用户的输入
        // 步骤
        // Scanner类表示简单文本扫描器，在java.util包里
        // 1. 引入Scanner类所在的包
        // 2. 创建Scanner对象，new 创建一个对象
        // myScanner是Scanner类的对象
        Scanner myScanner = new Scanner(System.in);
        // 3.接收用户的输入
        System.out.println("请输入名字");
        String name = myScanner.next(); // 接收用户输入字符串
        System.out.println("请输入年龄");
        int age = myScanner.nextInt(); // 接收用户输入int
        System.out.println("请输入薪水");
        double sal = myScanner.nextDouble(); // 接收用户输入double
        System.out.println("名字=" + name + " 年龄=" + age + " 薪水=" + sal);
    }
}