package com.xiaobai.t1;

/**
 * @author 江湖人称白玉汤
 * @program 剑指Offer
 * @description 实现单例模式的四种方式
 * @create 2020-04-29 15:50
 **/
//懒汉式
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){}
    public static Singleton1 getSingleton() {
        if (instance == null) instance = new Singleton1();
        return instance;
    }
}
//饿汉式
class Singleton2 {
    private static Singleton2 instance = new Singleton2();
    private Singleton2() {}
    public static Singleton2 getSingleton() {
        return instance;
    }
}
//双重锁
class Singleton3 {
    private static Singleton3 instance;
    private Singleton3() {}
    public static Singleton3 getSingleton() {
        if (instance==null) {
            synchronized (Singleton3.class){
                if (instance==null) instance = new Singleton3();
            }
        }
        return instance;
    }
}
//内部类
class Singleton4 {
    private Singleton4() {}
    private static class InnerClass{
        private static final Singleton4 instance = new Singleton4();
    }
    public static Singleton4 getSingleton() {
        return InnerClass.instance;
    }
}