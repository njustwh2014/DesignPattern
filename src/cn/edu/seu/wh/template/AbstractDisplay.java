package cn.edu.seu.wh.template;

public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();
    public final void display(){
        //父类定义处理流程
        //子类无法重写
        open();
        for(int i=0;i<5;i++){
            print();
        }
        close();
    }
}
