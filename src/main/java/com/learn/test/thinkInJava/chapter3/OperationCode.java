package com.learn.test.thinkInJava.chapter3;


/**
 * @功能职责: 操作符优先级学习
 * @描述：
 * @作者: 郭辉
 * @创建时间: 2020-12-02
 * @copyright Copyright (c) 2020 中国软件与技术服务股份有限公司
 * @company 中国软件与技术服务股份有限公司
 */
public class OperationCode {

    /**
     * 位操作符：
     * &，|，！，^
     * 注： ^: 相同为0，不同为 1
     * */
    public static void byteOperationCode(){
        int x = 0Xaaaa;
        int y = 0X5555;

        System.out.println("x = " + Integer.toBinaryString(x));
        System.out.println("y = " + Integer.toBinaryString(y));

        System.out.println("x & y = " + Integer.toBinaryString(x&y));
        System.out.println("x | y = " + Integer.toBinaryString(x|y));
        System.out.println("x ^ y = " + Integer.toBinaryString(x^y));
    }

    /**
     * ++i 与 i++
     *
     * ++i : 前缀式： 先进行运算，最后生成值
     * i++ : 后缀值： 先生成值，在进行运算
     *
     * */
    public static void tsetPlus(){
        int x = 4;
        System.out.println("x = " + x);
        System.out.println("++x = " + ++x);
        System.out.println("x++ = " + x++);
        System.out.println("x = " + x);
    }

    public static void main(String[] args) {
        OperationCode.byteOperationCode();
        OperationCode.tsetPlus();
    }
}
