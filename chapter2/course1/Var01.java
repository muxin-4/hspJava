/**
 * 变量使用注意事项
 * 1. 变量表示内存的一块存储区域【不同的变量，类型不同，占用的空间大小不同，比如：int 4 个字节，double 8 个字节】
 * 2. 该区域有自己的名称【变量名】和类型【数据类型】
 * 3. 变量必须先声明，后使用，即有顺序
 * 4. 该区域的数据可以在同一类型范围内不断变化
 * 5. 变量在同一个作用域内不能重名
 * 6. 变量=变量名+值+数据类型，这一点请大家注意
 */
public class Var01 {

    // 编写一个main方法
    public static void main(String[] args) {

        // 声明变量
        int a;
        a = 100;
        System.out.println(a);

        // 还可以这样使用
        int b = 800;
        System.out.println(b);
    }
}