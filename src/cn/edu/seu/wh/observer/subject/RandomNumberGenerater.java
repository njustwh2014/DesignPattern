package cn.edu.seu.wh.observer.subject;

import java.util.Random;

public class RandomNumberGenerater extends NumberGenerater {
    private Random random=new Random();
    private int number=0;
    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for(int i=0;i<50;i++){
            number=random.nextInt(50);
            notifyObserver();
        }
    }
}
