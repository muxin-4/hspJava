public class MethodExercise02 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "milan";
        p.age = 100;

        MyTools tools = new MyTools();
        Person p2 = tools.copyPerson(p);

        // 到此，p和p2是Person对象，但是是两个独立的对象，属性相同
        System.out.println("p的属性age=" + p.age + " 名字=" + p.name);
        System.out.println("p2的属性age=" + p2.age + " 名字=" + p2.name);
        System.out.println("p和p2是否是同一个对象" + (p == p2));
    }
}

class Person {
    String name;
    int age;
}

class MyTools {
    // 2）编写一个方法copyPerson，可以复制一个Person对象，返回复制的对象。克隆对象，
    // 注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同

    // 思路
    // 1.方法的返回类型 Person
    // 2，方法的名字 copyPerson
    // 3，方法的形参（Person p）
    // 4.方法体，创建一个新对象，并复制属性，返回即可

    public Person copyPerson(Person p) {
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;

        return p2;
    }
}
