package cn.edu.seu.wh.singleton.synchronize;

public class Main extends Thread{

    public static void main(String[] args){
        System.out.println("start.");
        new Main("A").start();
        new Main("B").start();
        new Main("C").start();
        System.out.println("end.");

    }
    public void run(){
        Singleton obj=Singleton.getInstance();
        System.out.println(getName()+": obj= "+obj+" Singleton");
        SingletonModify singletonModify=SingletonModify.getInstance();
        System.out.println(getName()+": obj= "+obj+" SingletonModify");
    }
    public Main(String name){
        super(name);
    }
}
