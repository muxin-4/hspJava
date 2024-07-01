public class Method01 {
    public static void main(String[] args) {
        // 方法使用
        // 1.方法写好后，如果不去调用，不会输出
        // 2.先创建对象，然后调用方法即可
        Person p1 = new Person();
        p1.speak();
    }
}

class Person {
    String name;
    int age;
    // 方法（成员方法）
    // 添加speak 成员方法，输出“我是一个好人”
    // 老韩解读
    // 1.public： 表示方法是公开
    // 2.void：表示方法是没有返回值
    // 3.speak()：speak是方法名，()形参列表
    // 4.{} 方法体，可以写我们要执行的代码
    // 5.System.out.println("我是一个好人"); 表示我们的方法就是输出一句话
    public void speak() {
        System.out.println("我是一个好人");
    }

}