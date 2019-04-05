package cn.edu.seu.wh.singleton;

public class Main {
    
    public static void main(String[] args){  
        Singleton obj1=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();
        //可以发现只初始化了一次
        if(obj1==obj2){
            System.out.println("两个实例相同！");
        }else{
            System.out.println("两个实例不同！");
        }

    }
}
