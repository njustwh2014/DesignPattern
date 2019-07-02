package cn.edu.seu.wh.observer.observer;

import cn.edu.seu.wh.observer.subject.NumberGenerater;

public interface Observer {
    public abstract void update(NumberGenerater numberGenerater);
}
