// 这是java的快速入门：演示java的开发步骤
// 对代码的相关说明
// 1.public class Hello 表示Hello是一个类，是一个public公有的类
// 2.Hello{ } 表示一个类的开始和结束
// 3.public static void main(String[] args)表示一个主方法，即我们程序的入口
// 4.main() {} 表示方法的开始和结束
// 5.System.out.pringln("hello,world~"); 表示输出"hello,world~"到屏幕
// 6.;表示语句结束
public class Hello {

    // 编写一个main方法
    public static void main(String[] args) {
        System.out.println("hello,world~");
    }
}

/**
 * Java开发注意事项和细节说明
 * 1.Java源文件以.java为扩展名。源文件的基本组成部分是类（class），如本类中的Hello类。
 * 2.Java应用程序的执行入口是main()方法。它有固定的书写格式：
 * public static void main(String[] args) {...}
 * 
 * 3.Java语言严格区分大小写。
 * 4.Java方法是由一条条语句构成，每个语句以";"结束。
 * 5.大括号都是成对出现的，缺一不可。【习惯，先写{}再写代码】
 * 
 * 6.一个源文件中最多只能有一个public类。其它类的个数不限。[演示]
 * 7.如果源文件包含一个public类，则文件名必须按该类名命名！
 * 8.可以将main方法写在非public类中，然后制定运行非public类，这样入口方法就是非public的main方法。
 */