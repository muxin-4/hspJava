0062 运算符介绍
运算符是一种特殊的符号，用以表示数据的运算、赋值和比较等。
1.算数运算符
2.赋值运算符
3.关系运算符[比较运算符]
4.逻辑运算符
5.位运算符[需要二进制基础]
6.三元运算符


算数运算符
算数运算符是对数值类型的变量进行运算的，在Java程序中使用的非常多。


| 运算符 | 运算           | 范例            | 结果        |
|-----|--------------|---------------|-----------|
| +   | 正号           | +7            | 7         |
| -   | 负号           | b=11;-b       | -11       |
| +   | 加            | 9 + 9         | 18        |
| -   | 减            | 10 - 8        | 2         |
| *   | 乘            | 7 * 8         | 56        |
| /   | 除            | 9/9           | 1         |
| %   | 取模（取余）       | 11%9          | 2         |
| ++  | 自增（前）：先运算后取值 | a=2;b=++a;    | a=3;b=3;  |
| ++  | 自增（后）：先取值后运算 | a=2;b=a++;    | a=3;b=2;  |
| --  | 自减（前）：先运算后取值 | a=2;b=--a;    | a=1;b=1;  |
| --  | 自减（后）：先取值后运算 | a=2;b=a--;    | a=1;b=2;  |
| +   | 字符串相加        | "hsp" + "edu" | "hsp edu" |


0063 算数运算符使用
案例演示算数运算符的使用（ArithmeticOperator.java）
1.+,-,*,/,%,++,--,重点讲解/、%、++
2.自增:++
作为独立的语句使用：
前++和后++都完全等价于i=i+1;
作为表达式使用
前++：++i先自增后赋值
后++：i++先赋值后自增
3.--、+、-、*是一个道理，完全可以类推

0064 算数运算符练习1
ArithmeticOperatorExercise01.java
1.面试题1
int i = 1; // i -> 1
i = i++; // 规则使用临时变量：（1）temp = i;（2）i = i + 1;（3）i = temp;
System.out.println(i); // 1
问：结果是多少？为什么？

2.面试题2
int i = 1;
i = ++i; // 规则使用临时变量：（1）i = i + 1;（2）temp = i;（3）i = temp;
System.out.println(i); // 2


自增，自减课堂练习，看看输出什么
ArithmeticOperatorExercise01.java

int i1 = 10;
int i2 = 20;
int i = i1++; // i1此时为10，所以i=10
System.out.print("i=" + i); // 10
System.out.println("i2=" + i2); // 20
i = --i2;
System.out.print("i=" + i); // 19
System.out.println("i2=" + i2); // 19

0066 算术运算符练习3
课堂练习2
// ArithmeticOperatorExercise02.java
1.假如还有59天放假，问：合xx个星期零xx天
59/7 59%7

0067 算术运算符练习4
2.定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：5/9*(华氏温度-100)，请求出华氏温度对应的摄氏温度。[234.5]

0068 关系运算符介绍
关系运算符（比较运算符）
1.关系运算符的结果都是boolean型，也就是要么是true，要么是false
2.关系表达式 经常用在if结构的条件中或循环结构的条件中

| 运算符        | 运算        | 范例                      | 结果    |
|------------|-----------|-------------------------|-------|
| ==         | 相等于       | 8==7                    | false |
| !=         | 不等于       | 8!=7                    | true  |
| <          | 小于        | 8<7                     | false |
| >          | 大于        | 8>7                     | true  |
| <=         | 小于等于      | 8<=7                    | false |
| >=         | 大于等于      | 8>=7                    | true  |
| instanceof | 检查是否是类的对象 | "hsp" instanceof String | true  |

0069 案例演示
案例演示关系运算符的使用(RelationalOperator.java)
int a = 9; // 提示：开发中，不可以使用a,b a1,bc n1,n2...
int b = 8;
System.out.println(a > b);
System.out.println(a >= b);
System.out.println(a <= b);
System.out.println(a < b);
System.out.println(a == b);
System.out.println(a != b);
boolean flag = a > b;

细节说明
1.关系运算符的结果都是boolean型，也就是要么是true，要么是false
2.关系运算符组成的表达式，我们称为关系表达式
3.比较运算符"=="不能误写成"="


0070 逻辑运算符介绍
介绍
用于连接多个条件（多个关系表达式），最终的结果也是一个boolean值。
1. a & b - 按位与运算符
   用途：对两个操作数的每一位执行按位与操作。
   逻辑行为：
   当 a 和 b 都为真（true）时，结果为真（true）。
   当 a 或 b 有一个为假（false）时，结果为假（false）。
   示例：
```java
   boolean a = true;
   boolean b = false;
   boolean result = a & b; // result 为 false
```
2. a && b - 逻辑与运算符（短路与）
   用途：对两个布尔操作数进行逻辑与运算。
   逻辑行为：
   当 a 和 b 都为真（true）时，结果为真（true）。
   如果 a 为假（false），则不会计算 b，结果直接为假（false）。这是短路特性。
```java 
   boolean a = true;
   boolean b = false;
   boolean result = a && b; // result 为 false
```
3. a | b - 按位或运算符
   用途：对两个操作数的每一位执行按位或操作。
   逻辑行为：
   当 a 和 b 中至少有一个为真（true）时，结果为真（true）。
   当 a 和 b 都为假（false）时，结果为假（false）。
```java
   boolean a = true;
   boolean b = false;
   boolean result = a | b; // result 为 true
```
4. a || b - 逻辑或运算符（短路或）
   用途：对两个布尔操作数进行逻辑或运算。
   逻辑行为：
   当 a 和 b 中至少有一个为真（true）时，结果为真（true）。
   如果 a 为真（true），则不会计算 b，结果直接为真（true）。这是短路特性。
```java
   boolean a = true;
   boolean b = false;
   boolean result = a || b; // result 为 true
```
5. !a - 逻辑非运算符
   用途：对一个布尔操作数进行逻辑非（取反）操作。
   逻辑行为：
   如果 a 为真（true），结果为假（false）。
   如果 a 为假（false），结果为真（true）。
```java
   boolean a = true;
   boolean result = !a; // result 为 false
```
6. a ^ b - 按位异或运算符
   用途：对两个操作数的每一位执行按位异或操作。
   逻辑行为：
   当 a 和 b 不同（一个为真，一个为假）时，结果为真（true）。
   当 a 和 b 相同（都为真或都为假）时，结果为假（false）。
   示例：
```
   java
   复制代码
   boolean a = true;
   boolean b = false;
   boolean result = a ^ b; // result 为 true
```
#### 总结
* 按位与 (a & b)：都为真时为真。
* 逻辑与 (a && b)：都为真时为真，有短路特性。
* 按位或 (a | b)：有一个为真时为真。
* 逻辑或 (a || b)：有一个为真时为真，有短路特性。
* 逻辑非 (!a)：取反操作。
* 按位异或 (a ^ b)：两个操作数不同时为真。

按位与运算符和逻辑与运算符，我看都一样啊?
在Java中，按位与运算符 & 和逻辑与运算符 && 的确在某些情况下可能会产生相似的结果，但它们有着根本不同的行为和使用场景：

按位与运算符 &
用途：按位与运算符 & 用于对两个整数的每一位执行位运算，并将结果应用于整数的每一位。
行为：它将两个操作数的对应位进行比较，只有当两个操作数的对应位都为1时，结果的对应位才为1；否则为0。
示例：
```java
复制代码
int a = 5;    // 二进制：0101
int b = 3;    // 二进制：0011
int result = a & b;  // 结果为 1，二进制：0001
```
逻辑与运算符 &&
用途：逻辑与运算符 && 用于对两个布尔操作数执行逻辑与操作。
行为：它具有短路特性，即如果第一个操作数为假（false），则不会对第二个操作数进行求值。
示例：
```java
复制代码
boolean a = true;
boolean b = false;
boolean result = a && b;  // 结果为 false
```
区别总结
操作数类型：

& 按位与运算符可以用于整数类型（如 int、long等）和布尔类型（boolean）。
&& 逻辑与运算符只能用于布尔类型（boolean）。
行为：

& 按位与运算符对每一位进行位运算。
&& 逻辑与运算符对两个布尔操作数进行逻辑运算，并具有短路特性。
使用场景：

& 用于对整数进行位操作，或者对多个布尔表达式进行按位与操作。
&& 用于对布尔表达式进行短路逻辑与操作，当第一个操作数为假时，可以避免计算第二个操作数。
虽然在某些情况下它们可能会产生相似的结果，但它们的行为和使用场景决定了它们在编程中的不同作用。











| a     | b     | a & b <br/>按位与运算符 | a && b<br/>逻辑与运算符（短路与） | a\|b<br/>按位或运算符 | a\|\|b<br/>逻辑或运算符 | !a <br/>逻辑非运算符  | a^b <br/>按位异或运算符  | 
|-------|-------|--------------|--------|------|--------|-------|-------|
| true  | true  | true         | true   | true | true   | false | false |
| true  | false | false        | false   | true | true   | false | true |
| false | true  | false        | false   | true | true   | true | true |
| false | false | false        | false   | false | false   | true | false |



0075 赋值运算符
赋值运算符就是将某个运算后的值，赋给指定的变量。

赋值运算符的分类

- 基本赋值运算符=
- 复合赋值运算符
+=,-=,*=,/=,%=等，重点讲解一个+=，其它的使用是一个道理
a += b; [等价 a = a + b;]
a -= b; [等价 a = a - b]


0076 赋值运算符细节
- 案例演示
案例演示赋值运算符的基本使用。AssignOperator.java
1.赋值基本案例[int num1 = 10]
2.+=的使用案例

- 赋值运算符特点
1.运算顺序从右向左 int num = a + b + c;
2.赋值运算符的左边只能是变量，右边可以是变量，表达式，常量值
3.复合赋值运算符等价于下面的效果
比如：a+=3;等价与a = a + 3;
4.复合赋值运算符会进行类型转换
byte b = 2; b += 3; b++;

0077 三元运算符
- 基本语法
条件表达式 ? 表达式1 : 表达式2;

1.如果条件表达式为true，运算后的结果是表达式1;
2.如果条件表达式为false,运算后的结果是表达式2;
 
案例演示 TernaryOperator.java
```java
int a = 10;
int b = 99;
int result = a > b ? a++ : b--;
```

0078 三元运算符细节

- 使用细节 TernaryOperatorDetail.java
1. 表达式1和表达式2要为可以赋给接收变量的类型（或可以自动转换）
2. 三元运算符可以转换成if-else语句
```java
int res = a > b ? a++ : --b; 
if(a > b) {
    res = a ++;
}else {
    res = --b;
}
```


课堂练习
案例：实现三个数的最大值















