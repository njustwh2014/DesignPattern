package cn.edu.seu.wh.bridge;

public class Main {

    public static void main(String[] args){
        CountDisplay cD=new CountDisplay(new StringDisplayImpl("王欢真的很帅！"));
        cD.display();
        System.out.println("----------------------");
        cD.multiDisplay(3);
    }
}
