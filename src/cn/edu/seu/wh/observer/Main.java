package cn.edu.seu.wh.observer;

import cn.edu.seu.wh.observer.observer.DigitObserver;
import cn.edu.seu.wh.observer.observer.GraphObserver;
import cn.edu.seu.wh.observer.subject.RandomNumberGenerater;

public class Main {
    public static void main(String[] args) {
        RandomNumberGenerater randomNumberGenerater=new RandomNumberGenerater();

        randomNumberGenerater.addObserver(new DigitObserver());
        randomNumberGenerater.addObserver(new GraphObserver());

        randomNumberGenerater.execute();
        randomNumberGenerater.execute();

    }
}
