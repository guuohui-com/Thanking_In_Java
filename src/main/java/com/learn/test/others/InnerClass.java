package com.learn.test.others;

/**
 * @功能职责: 内部类学习
 * @描述：
 * 内部类分为四种形式：
 *      静态内部类static inner class (also called nested class)
 *
 *      成员内部类member inner class
 *
 *      局部内部类local inner class
 *
 *      匿名内部类anonymous inner class
 *
 * @作者: 郭辉
 * @创建时间: 2020-12-02
 * @copyright Copyright (c) 2020 中国软件与技术服务股份有限公司
 * @company 中国软件与技术服务股份有限公司
 */
public class InnerClass {

    public InnerClass(){}

    private int a = 0;


    /*
    * 静态内部类
    * 被编译成一个完全独立的.class文件，
    * 名称为OuterClass$InnerClass.class的形式。
    * 只可以访问外部类的静态成员和静态方法，
    * 包括了私有的静态成员和方法。
    *
    * */
    static class StaticInnerClass{
        int a = 0;
        public StaticInnerClass(){
            InnerClass innerClass = new InnerClass();
            this.a = innerClass.a+1;
        }
    }

    /*
    * 成员内部类Member Inner Class
    * 成员内部类也是定义在另一个类中，但是定义时不用static修饰。
    * 成员内部类和静态内部类可以类比为非静态的成员变量和静态的成员变量。
    * 成员内部类就像一个实例变量。
    * 它可以访问它的外部类的所有成员变量和方法，不管是静态的还是非静态的都可以
    * */
    public class MemberInnerClass{
        int member = 0;
        public MemberInnerClass(){
            this.member = InnerClass.this.a+2;
        }
    }

    /*
    * 局部内部类Local Inner Class
    * 局部内部类定义在方法中，比方法的范围还小。是内部类中最少用到的一种类型。
    * 像局部变量一样，不能被public, protected, private和static修饰。
    * 只能访问方法中定义的final类型的局部变量。
    * 局部内部类在方法中定义，所以只能在方法中使用，
    * 即只能在方法当中生成局部内部类的实例并且调用其方法。
    * */
    public int someThing(int param){
        final int tem = param;
        class LocalInnerClass{
            int local = 0;
            public LocalInnerClass(){
                this.local = tem;
                System.out.println(tem+1);
            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        System.out.println(localInnerClass.local);
        return tem;
    }
}

class A{
    public static void main(String[] args) {
        /*
         * ============================== 内部类测试 ========================
         * */
        //静态内部类
        InnerClass.StaticInnerClass staticInnerClass = new InnerClass.StaticInnerClass();
        System.out.println(staticInnerClass.a);

        //成员内部类
        InnerClass.MemberInnerClass memberInnerClass = new InnerClass().new MemberInnerClass();
        System.out.println(memberInnerClass.member);

        //局部内部类
        InnerClass innerClass = new InnerClass();
        int result = innerClass.someThing(100);
        System.out.println(result);
    }
}
