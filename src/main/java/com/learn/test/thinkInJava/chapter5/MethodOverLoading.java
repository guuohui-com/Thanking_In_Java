package com.learn.test.thinkInJava.chapter5;

/**
 * @功能职责: thinking In Java 第五章 初始化与清理InitializationAndCleanup
 * @描述： 5.2方法重载
 *          （1） 重载方法的参数是基本类型时，会自动向上转化，即实际参数如果小于重载方法中的形式参数类型，则会进行自动转化。
 *          （2） 重载方法的参数是基本类型时，实际参数如果大于重载方法中的形式参数类型时，则会报错，除非进行强制类型转化。
 * @作者: 郭辉
 * @创建时间: 2020-12-02
 * @copyright Copyright (c) 2020 中国软件与技术服务股份有限公司
 * @company 中国软件与技术服务股份有限公司
 */
public class MethodOverLoading {

    public void overLoadind(byte pamram){
        System.out.println(" overLoadind(byte) ");
    }

    public void overLoadind(char pamram){
        System.out.println(" overLoadind(char) ");
    }

    public void overLoadind(short pamram){
        System.out.println(" overLoadind(short) ");
    }

//    public void overLoadind(int pamram){
//        System.out.println(" overLoadind(int) ");
//    }

    public void overLoadind(long pamram){
        System.out.println(" overLoadind(long) ");
    }

    public void overLoadind(float pamram){
        System.out.println(" overLoadind(float) ");
    }

//    public void overLoadind(double pamram){
//        System.out.println(" overLoadind(double) ");
//    }

    public static void main(String[] args) {
        MethodOverLoading methodOverLoading = new MethodOverLoading();
        /**
         * 此时为double时，位数比所有重载函数位数都大，所以会编译报错
         * */
//        methodOverLoading.overLoadind(1d);
        methodOverLoading.overLoadind(  1);
    }
}
