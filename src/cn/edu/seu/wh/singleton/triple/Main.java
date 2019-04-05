package cn.edu.seu.wh.singleton.triple;

public class Main {

    public static void main(String[] args){
        Triple obj1=Triple.getInstance(0);
        System.out.println("华丽的分割线");
        //可以发现，在第一次调用getInstance方法时，已经初始化了三个实例。
        Triple obj2=Triple.getInstance(1);
        Triple obj3=Triple.getInstance(2);
        System.out.println(obj1);
    }
}
