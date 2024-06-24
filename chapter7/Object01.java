public class Object01 {

    // 编写一个main方法
    public static void main(String[] args) {
        /**
         * 张老太养了两只猫猫：一只名字叫小白，今年3岁，白色。
         * 还有一只叫小花，今年100岁，花色。请编写一个程序，当用户输入小猫的名字时，
         * 就显示该猫的名字，年龄，颜色。如果用户输入的小猫名错误，
         * 则显示张老太没有这只猫猫。
         */
        // 一、单独变量来解决 => 不利于数据的管理（你把一只猫的信息拆解）
        // 第一只猫信息
//        String cat1Name = "小白";
//        int cat1Age = 3;
//        String cat1Color = "白色";

        // 第二只猫信息
//        String cat2Name = "小花";
//        int cat2Age = 100;
//        String cat2Color = "花色";

        /**
         * 二、数组 =>
         * 1.数组元素数据类型无法单独表示
         * 2.只能通过下标获取信息，造成变量名字和内容的对应关系不明确
         * 3.不能体现猫的行为
         */
        // 第一只猫信息
//        String[] cat1 = {"小白", "3", "白色"};
//        String[] cat2 = {"小花", "100", "花色"};

        /**
         * 使用现有技术解决张老太养猫问题，
         * 一、单独变量来解决
         * 二、数组
         *
         * 现有技术解决的缺点分析
         *
         * 不利于数据的管理
         * 效率低
         * ==> 引出我们的新知识点 类与对象
         *
         * java设计者引入类与对象（OOP），根本原因就是现有技术，不能完美的解决新的需求
         */

        // 使用OOP面向对象解决
        // 实例化一只猫[创建一只猫对象]
        // 老韩解读
        // 1.new Cat() 创建一只猫（猫对象）
        // 2.Cat cat1 = new Cat(); 把创建的猫赋值给cat1
        // 3.cat1 就是一个对象
        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";
        cat1.weight = 10;

        // 创建第二只猫，并赋给cat2
        // cat2也是一个对象（猫对象）
        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 100;
        cat2.color = "花色";
        cat2.weight = 20;

        // 怎么访问对象的属性呢
        System.out.println("第一只猫信息" + cat1.name + " " + cat1.age + " " + cat1.color + " " + cat1.weight);
        System.out.println("第二只猫信息" + cat2.name + " " + cat2.age + " " + cat2.color + " " + cat2.weight);
    }
}

// 使用面向对象的方式来解决养猫问题
// 定义一个猫类Cat -> 自定义的数据类型
class Cat {
    //属性
    String name; // 名字
    int age; // 年龄
    String color; // 颜色
    double weight; // 体重
}



