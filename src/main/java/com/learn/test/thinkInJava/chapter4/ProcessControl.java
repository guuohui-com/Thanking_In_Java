package com.learn.test.thinkInJava.chapter4;


/**
 * @功能职责: 第四章 流程控制语句
 * @描述：
 * @作者: 郭辉
 * @创建时间: 2020-12-02
 * @copyright Copyright (c) 2020 中国软件与技术服务股份有限公司
 * @company 中国软件与技术服务股份有限公司
 */
public class ProcessControl {

    /**
     * 标签学习
     * continue,break,常用，不加介绍
     * continue lable ： 跳出本次循环到lable，但是会在外部循环继续执行循环体
     * break lable : 跳出循环体到标签，不再执行本循环体
     * 注： continue 和 break 后面跟的lable不能是循环之外的lable，即不能是与当前循环无关的lable
     */
    public static void label() {
        int i = 0;
        /*outer:
        for (i = 0; i < 10; ++i){
            if (i == 5){
                continue outer;
            }
            System.out.println("i = " + i);
            System.out.println(i == 5);
        }*/
     /*   for (i = 0; i < 10; ++i){
            if (i == 5){
                break outer;
            }
            System.out.println("i = " + i);
            System.out.println(i == 5);
        }*/
        /*for (i = 0; i < 10; ++i){
            inner:
            for(int k = 0; k < 5; ++k){
                if ( k == 3){
                    continue outer;
                    continue inner;
                }
                System.out.println("i = " + i);
                System.out.println("k = " + k);
            }
        }*/
        /*for (i = 0; i < 10; ++i){
            inner:
            for(int k = 0; k < 5; ++k){
                if ( k == 3){
                    break outer;
//                    break inner;
                }
                System.out.println("i = " + i);
                System.out.println("k = " + k);
            }
        }*/

        /*for (i = 0; i < 10; ++i) {
            if (i == 5) {
                continue outerEnd;
//                break outerEnd;
            }
            System.out.println("i = " + i);
            System.out.println(i == 5);
        }
        outerEnd:
        System.out.println("end");*/
    }

    public static void main(String[] args) {
        ProcessControl.label();
    }

}
