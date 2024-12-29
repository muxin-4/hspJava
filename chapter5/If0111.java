public class If0111 {
    public static void main(String[] args) {
        boolean b = true;
        if(b = false) // 这里是给变量赋值
            System.out.println("a");
        else if(b)
            System.out.println("b");
        else if(!b)
            System.out.println("c");
        else
            System.out.println("d");
    }
}