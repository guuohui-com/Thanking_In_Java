package com.learn.test.others;


/**
 * @功能职责: 深拷贝与浅拷贝
 * @描述：
 * @作者: 郭辉
 * @创建时间: 2020-12-02
 * @copyright Copyright (c) 2020 中国软件与技术服务股份有限公司
 * @company 中国软件与技术服务股份有限公司
 */


import java.io.*;

/**
 * ============================ 浅拷贝测试类 ==================================
 * */
class Person implements Cloneable{
    private String name ;
    private int age;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Address{
    private String provice;
    private String city;

    public String getProvice() {
        return provice;
    }

    public void setProvice(String provice) {
        this.provice = provice;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address(String provice, String city) {
        this.provice = provice;
        this.city = city;
    }
}

/**
 * ============================ 深拷贝测试类 ==================================
 * */
class DeepPerson implements Serializable,Cloneable{

    private static final long serialVersionUID = 1L;

    private String name ;
    private int age;
    private DeepAddress address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DeepAddress getAddress() {
        return address;
    }

    public void setAddress(DeepAddress address) {
        this.address = address;
    }

    public DeepPerson(String name, int age, DeepAddress address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * 利用序列化和反序列化实现深度拷贝
     * */
    public Object deepClone() throws Exception{
        // 序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(this);

        // 反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        return ois.readObject();
    }

}

class DeepAddress implements Serializable{

    private static final long serialVersionUID = 1L;

    private String provice;
    private String city;

    public String getProvice() {
        return provice;
    }

    public void setProvice(String provice) {
        this.provice = provice;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public DeepAddress(String provice, String city) {
        this.provice = provice;
        this.city = city;
    }
}

/**
 * 深拷贝与浅拷贝的测试类
 *
 * */
public class Copy {

    /**
     * 浅拷贝测试，
     * 浅拷贝一个对象时，对象中的属性分为进本类型和引用类型
     * 对于基本类型，将其值完全复制一份
     * 对于引用类型，则是将其引用对象复制一份。
     * */
    public static void shallowCopy() throws CloneNotSupportedException {
        Person person = new Person("张三",20,new Address("河北省","张家口"));
        // 浅拷贝对象
        Person personClone = (Person) person.clone();
        /**
         * hashCode 不同，证明不是同一个对象
         * */
        System.out.println(person.hashCode());
        System.out.println(personClone.hashCode());

        /**
         * 浅拷贝对象中基本类型属性一致，即浅拷贝时将基本类型属性完全复制
         * */
        System.out.println(person.getName());
        System.out.println(personClone.getName());
        /**
         * 注意： 对于引用类型属性，只是复制其引用，即与被拷贝对象用的是同一个对象
         * */
        System.out.println(person.getAddress().getProvice());
        System.out.println(personClone.getAddress().getProvice());
        personClone.getAddress().setProvice("北京");
        System.out.println(person.getAddress().getProvice());
        System.out.println(personClone.getAddress().getProvice());
    }

    /**
     * 深拷贝测试：
     * 无论是基本数据类型，还是引用数据类型，都复制一份
     * */
    public static void deepCopy() throws Exception {
        DeepPerson person = new DeepPerson("张三",20,new DeepAddress("河北省","张家口"));
        // 深拷贝对象
        DeepPerson personClone = (DeepPerson) person.deepClone();
        /**
         * hashCode 不同，证明不是同一个对象
         * */
        System.out.println(person.hashCode());
        System.out.println(personClone.hashCode());

        /**
         * 深拷贝对象中基本类型属性一致，即浅拷贝时将基本类型属性完全复制
         * */
        System.out.println(person.getName());
        System.out.println(personClone.getName());
        /**
         * 修改深拷贝对象，验证是否影响被拷贝对象
         * */
        System.out.println(person.getAddress().getProvice());
        System.out.println(personClone.getAddress().getProvice());
        personClone.getAddress().setProvice("北京");
        System.out.println(person.getAddress().getProvice());
        System.out.println(personClone.getAddress().getProvice());
    }


    public static void main(String[] args) {
        /**
         * 测试浅拷贝对象
         * */
        try {
            Copy.shallowCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

       /**
        * 测试深拷贝对象
        * */
        try {
            Copy.deepCopy();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}



