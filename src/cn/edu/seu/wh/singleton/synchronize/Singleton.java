package cn.edu.seu.wh.singleton.synchronize;

public class Singleton {
    private static Singleton singleton=null;
    // 构造器设置成private是为了防止在类外new，从而保证只有一个实例
    private Singleton(){
        System.out.println("生成一个实例");
    }
    public static Singleton getInstance(){
        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }
}
