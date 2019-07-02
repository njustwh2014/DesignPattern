package cn.edu.seu.wh.observer.subject;

import cn.edu.seu.wh.observer.observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerater {
    private ArrayList<Observer> observers=new ArrayList<>();
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObserver(){
        Iterator<Observer> iterator=observers.iterator();
        while(iterator.hasNext()){
            Observer observer=iterator.next();
            observer.update(this);
        }
    }
    public abstract int getNumber();
    public abstract void execute();
}
