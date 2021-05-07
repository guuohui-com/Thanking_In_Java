package com.learn.test.others;


/**
 * @功能职责: 理解构造块和静态块
 * @描述：
 * @作者: 郭辉
 * @创建时间: 2020-12-02
 * @copyright Copyright (c) 2020 中国软件与技术服务股份有限公司
 * @company 中国软件与技术服务股份有限公司
 */
public class Test {



    public Test(){
        System.out.println("========构造方法");
    }

    public void Test(){
        System.out.println("普通方法");
    }

    /*
    * 构造块，每次new对象都会执行
    * */
    {
        System.out.println("构造块");
    }

    /*
    * 静态块，只执行一次
    *
    * */
    static Test tt = new Test();
    static {
        System.out.println("静态块");
    }


    public static void main(String[] args) {
        System.out.println("main()");
        Test test = new Test();
        Test test1 = new Test();

    }
}
