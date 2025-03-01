import java.util.Arrays;

public class MethodParameter02 {

    public static void main(String[] args) {
        B b = new B();
        // int[] arr = {1, 2, 3};
        // b.test100(arr);
        // System.out.println("main方法arr[0]=" + Arrays.toString(arr));


        Person p = new Person();
        p.name = "jack";
        p.sal = 5000;

        b.test200(p);
        System.out.println("main方法p=" + p.sal); 
    }
}

class B {

    public void test100(int[] arr) {
        arr[0] = 200;
        System.out.println("test100方法arr[0]=" + Arrays.toString(arr));
    }

    public void test200(Person p) {
        // 修改对象属性,p引用的是main方法的p对象，所以main方法的p对象的属性也会变化
        // p.name = "tom";
        // p.sal = 8000;
        // System.out.println("test200方法p=" + p.sal);


        // 修改p的指向为null，main方法的p不会变化，p指向了null
        // p = null;

        // 修改p的指向为新的对象，main方法的p不会变化，p指向了新的对象
        p = new Person();
        p.name = "tom";
        p.sal = 999;
        System.out.println("test200方法p=" + p.sal);
    }   
}

class Person {
    String name;
    double sal;
    
}