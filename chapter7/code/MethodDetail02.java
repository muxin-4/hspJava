
public class MethodDetail02 {

    public static void main(String[] args) {
        A a = new A();
        a.sayOk();
    }
}

class A {

    public void print(int n) {
        System.out.println("print()方法被调用 n=" + n);
    }

    public void sayOk() { // sayOk调用 print（直接调用即可）
        print(10);
        System.out.println("继续执行sayOK()");
    }

    // 跨类中的方法A类调用B类方法：需要通过对象名调用。
    public void m1() {
        // 创建B对象，然后在调用方法即可
        System.out.println("m1() 方法被调用");
        B b = new B();
        b.hi();
        System.out.println("m1() 方法继续执行");
    }
}

class B {

    public void hi() {
        System.out.println("B类中的hi()被执行");
    }
}
