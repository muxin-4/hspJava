1.java数据类型分为两大类 基本数据类型，引用类型
2.基本数据类型有8种 数值型[byte, short, int, long, float, double] char,boolean
3.引用类型[类，接口，数组]

一、整数类型

|  类型   | 存储空间  |   范围  |
|  ----  | -------  | ------ |
| byte[字节]  | 1字节    |  -128 ~ 127      |  
| short[短整型]  | 2字节    |   -(2^15) ~ (2^15)-1     |
| int[长整型]  | 4字节    |   -(2^31) ~ (2^31)-1     |
| long[长整型]  | 8字节    |   -(2^63) ~ (2^63)-1     |


```java
byte n1 = 10; // 空间1个字节
short n2 = 10; // 空间2个字节
int n3 = 10; // 空间4个字节
long n4 = 10; // 空间8个字节
```

1.java各整数类型有固定的范围和字段长度，不受具体OS「操作系统」的影响，以保证java程序的可移植性。
2.java的整型常量（具体）默认为int型，声明long型常量须后加'|'或'L'
3.java程序中变量常声明为int型，除非不足以表示大数，才使用long
4.bit：计算机中的最小存储单位。byte：计算机中基本存储单元 1byte = 8 bit。

二、浮点类型
Java的浮点类型可以表示一个小数，比如123.4,7.8,0.12等

|  类型   | 存储空间  |   范围  |
|  ----  | -------  | ------ |
| float[单精度]  | 4字节    |  -3.403E38 ~ 3.403E38      |  
| double[双精度]  | 8字节    |   -1.798E308 ~ 1.798E308     |

说明
1.关于浮点数在机器中存放形式的简单说明，浮点数=符号位+指数位+尾数位
2.尾数部分可能丢失，造成精度损失（小数都是近似值）

浮点型使用细节
1. 与整数类型类似，Java浮点数也有固定的范围和长度字段，不受具体OS影响。[float 4个字节，double8个字节]
2. Java的浮点型常量（具体值）默认为double型，声明float型常量，须后加'f'或'F'
3. 浮点型常量有两种表示形式
十进制数形式：如：5.12 512.0f  .512（必须有小数点）
科学计数法形式：如：5.12e2[5.12*10的2次方]  5.12E-2 [5.12/10的2次方]
4.通常情况下，应该使用double型，因为double比float型更精确
double num9 = 2.1234567851;
float num10 = 2.1234567851F;
5.浮点数使用陷阱：2.7 和 8.1/3 比较


三、字符类型(char)

字符类型可以表示单个字符，字符类型是char，char是两个字节（可以存放汉字），多个字符我们用字符串String（我们后面详细讲解String）

案例演示 Char01.java

# 代码
```
char c1 = 'a';
char c2 = '\t';
char c3 = '韩';
char c4 = 97;
```

字符类型本质探讨
1.字符型存储到计算机中，需要将字符对应的码值（整数）找出来，比如'a'
存储：'a'==>码值97==>二进制(110 0001)==>存储
读取：二进制(110 0001)=>97===>'a'=>显示

2.字符和码值的对应关系是通过字符编码表决定的（是已经规定好的了）
介绍一下字符编码表
ASCII(ASCII编码表 一个字节表示，是一种使用 7 位二进制数字表示的字符编码标准，可以表示128个字符。)
Unicode：Unicode编码表 固定大小的编码 使用两个字节来表示字符，字母和汉字统一都是占用两个字节，这样浪费空间
utf-8：编码表，大小可变的编码 字母使用1个字节，汉字3个字节
gbk：可以表示汉字，而且范围广，字母使用1个字节，汉字2个字节
gb2312:可以表示汉字, gb2312 < gbk
big5码：繁体中文，台湾，香港

3.一个字节可以表示多少个字符？
一个字节（8位）可以表示256个不同的值。这是因为一个字节有8个位，每个位可以取0或1两个值，所以总共有2^8 = 256个可能的组合