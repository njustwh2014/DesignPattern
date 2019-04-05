package cn.edu.seu.wh.singleton;

public class Singleton {
    // static只初始化一次
    private static Singleton singleton=new Singleton();
    // 构造器设置成private是为了防止在类外new，从而保证只有一个实例
    private Singleton(){
        System.out.println("生成一个实例");
    }
    public static Singleton getInstance(){
        return singleton;
    }
}
