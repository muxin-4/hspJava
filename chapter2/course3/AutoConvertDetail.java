// 自动类型转换细节
public class AutoConvertDetail {

    // 编写一个main方法
    public static void main(String[] args) {
        // 细节1：有多种类型的数据混合运算时，系统首先自动将据转换成精度最大的那种数据类型，然后再进行计算
        // int n1 = 10; // ok
        // float d1 = n1 + 1.1; // error:不兼容的类型: 从double转换到float可能会有损失  错误 n1 + 1.1 => 结果类型是 double 
        // double d1 = n1 + 1.1; // 对 n1 + 1.1 => 结果类型是double
        // float d1 = n1 + 1.1F; // 对 n1 + 1.1 => 结果类型是float

        // 细节2：当我们把精度大的数据类型赋值给精度小的数据类型时，就会报错，反之就会进行自动类型转换。
        // int n2 = 1.1; // error:不兼容的类型: 从double转换到int可能会有损失

        // 细节3：(byte,short)和char之间不会相互自动转换。
        // byte b1 = 128; // 错误: 不兼容的类型: 从int转换到byte可能会有损失
        // byte b1 = -129; // 错误: 不兼容的类型: 从int转换到byte可能会有损失
        // byte b1 = 127; // ok
        // int n2 = 1;
        // byte b2 = n2; // 不兼容的类型: 从int转换到byte可能会有损失

        // 细节4：byte,short,char 他们三者可以计算，在计算时首先转换为int类型
        // byte b2 = 1;
        // byte b3 = 2;
        // short s1 = 1;
        // // short s2 = b2 + s1; // error: 错误: 不兼容的类型: 从int转换到short可能会有损失     b2 + s1 => int
        // // int s2 = b2 + s1; // 对

        // byte b4 = b2 + b3; // error: 错误: 不兼容的类型: 从int转换到short可能会有损失     b2 + b3 => int   即使是两个byte相加，也会转为int

        // 细节5：boolean不参与转换
        // boolean pass = true;
        // int num100 = pass; // 错误: 不兼容的类型: boolean无法转换为int

        // 细节6：自动提升原则：表达式结果的类型自动提升为操作数中最大的类型
        byte b4 = 1;
        short s3 = 100;
        int num200 = 1;
        double num300 = 1.1;

        float num500 = b4 + s3 + num200 + num300; // 错误: 不兼容的类型: 从double转换到float可能会有损失
    }
}