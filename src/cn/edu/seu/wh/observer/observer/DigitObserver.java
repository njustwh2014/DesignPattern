package cn.edu.seu.wh.observer.observer;

import cn.edu.seu.wh.observer.subject.NumberGenerater;

public class DigitObserver implements Observer {

    @Override
    public void update(NumberGenerater numberGenerater) {
        System.out.println("DigitObserver: "+numberGenerater.getNumber());
        try{
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
