package cn.edu.seu.wh.singleton.synchronize;

public class SingletonModify {
    private static SingletonModify singletonModify=null;
    //private static Singleton singleton=new Singleton();
    // 构造器设置成private是为了防止在类外new，从而保证只有一个实例
    private SingletonModify(){
        System.out.println("生成一个Modify实例");
    }
    public static synchronized SingletonModify getInstance(){
        if(singletonModify==null){
            singletonModify=new SingletonModify();
        }
        return singletonModify;
    }
}
