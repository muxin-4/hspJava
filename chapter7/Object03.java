public class Object03 {
    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.age = 10;
//        p1.name = "小明";
//        Person p2 = p1; // 把p1赋给了p2,让p2指向p1
//        System.out.println(p2.age); // 10


        Person a = new Person();
        a.age = 10;
        a.name = "小明";
        Person b;
        b = a;
        System.out.println(b.name); // 小明
        b.age = 200;
        b = null;
        System.out.println(a.age); // 200
        System.out.println(b.age); // Exception in thread "main" java.lang.NullPointerException
    }
}

class Person {
    String name;
    int age;
}