package com.learn.test.thinkInJava.chapter3;



/**
 * @功能职责: 别名机制学习，
 *      java对于基本数据类型的复制，是直接将值复制一份，然后经变量的引用指向当前值；
 *      java对于引用数据类型，是将前变量的引用复制给薪的变量，即，两个变量的引用指向同一个引用对象
 *
 * @描述：
 * @作者: 郭辉
 * @创建时间: 2020-12-02
 * @copyright Copyright (c) 2020 中国软件与技术服务股份有限公司
 * @company 中国软件与技术服务股份有限公司
 */


public class Alias {

    public class Tank{
        private int result;
    }

    public static void main(String[] args) {

        /**
         * 在堆上开辟内存空间，存实例对象
         * 默认初始化对象
         * 在栈上分配内存空间，存对象的引用
         * */
        Alias.Tank tank1 = new Alias().new Tank();
        Alias.Tank tank2 = new Alias().new Tank();
        tank1.result = 1;
        tank2.result = 2;
        System.out.println(tank1.result+"================="+tank2.result);

        /**
         * 将thank2 的引用复制给thank1，此时，thank1的引用指向thank2的实例对象
         * */
        tank1 = tank2;
        System.out.println(tank1.result+"================="+tank2.result);

        /**
         * 证明： java引用类型赋值是将引用复制给变量，而基本数据类型是将值复制一份给变量
         * */
        tank1.result = 10;
        System.out.println(tank1.result+"================="+tank2.result);

    }
}

