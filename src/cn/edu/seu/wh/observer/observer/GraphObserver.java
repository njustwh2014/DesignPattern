package cn.edu.seu.wh.observer.observer;

import cn.edu.seu.wh.observer.subject.NumberGenerater;

public class GraphObserver implements Observer{
    @Override
    public void update(NumberGenerater numberGenerater) {
        int number=numberGenerater.getNumber();
        System.out.print("GraphObserver: ");
        for(int i=0;i<number;i++){
            System.out.print('*');
        }
        try{
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("");
    }
}
