package com.learn.test.thinkInJava.chapter2;

/**
 * @功能职责: java作用域
 * @描述：
 * @作者: 郭辉
 * @创建时间: 2020-12-02
 * @copyright Copyright (c) 2020 中国软件与技术服务股份有限公司
 * @company 中国软件与技术服务股份有限公司
 */
public class scope {
/*    {
        int x = 12;
        {
            *//*
            * C/C++ 中，这样是合法的，支持将一个较大作用于的变量隐藏起来，
            * 但是java不允许，因为java社设计者认为这样做会造成程序混乱
            * *//*
            int x = 10;
        }
    }*/

    public static void main(String[] args) {
        System.getProperties().list(System.out);
    }
}
