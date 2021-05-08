package com.learn.test.thinkInJava.chapter5;

/**
 * @功能职责: thinking In Java 第五章 初始化与清理InitializationAndCleanup
 * @描述：5.4 this 关键字理解:
 *          （1） 表示当前对象
 *          （2） 给this加上参数列表，表示对当前对象构造器的使用
 *                  this最够可调用一个构造器
 *                  this调用构造器语句位置必须放在函数的的最开始处
 * @作者: 郭辉
 * @创建时间: 2020-12-02
 * @copyright Copyright (c) 2020 中国软件与技术服务股份有限公司
 * @company 中国软件与技术服务股份有限公司
 */
public class This {
    private int num;
    private String name;

    public This(){
        this(1,"hello");
//        this(1);
        System.out.println("This()");
    }

    public This(int num){
        this.num = num;
    }

    public This(String name){
        this.name = name;
    }

    public This(int num,String name){
        this.num = num;
        this.name = name;
    }

    public static void main(String[] args) {
        /**
         * 检验this构造器调用
         * */
        This t = new This();


//        new Person().eat(new Apple());
    }

}
class Person{
    public void eat(Apple apple){
        Apple peeled = apple.getApple();
        Apple peel = Peeler.peel(apple);
        System.out.println(apple.getApple().hashCode());
        System.out.println( Peeler.peel(apple).hashCode());
        System.out.println(peeled.hashCode());
        System.out.println(peel.hashCode());
//        System.out.println("yummy");
    }
}
class Apple{

    Apple getApple(){
        return Peeler.peel(this);
    }
}
class Peeler{
    static Apple peel(Apple apple){
        return apple;
    }
}