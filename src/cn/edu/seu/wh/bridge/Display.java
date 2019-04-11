package cn.edu.seu.wh.bridge;

public class Display {
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open(){
        impl.rawOpen();
    }

    public void print(){
        impl.rawPrint();
    }

    public void close(){
        impl.rawclose();
    }

    public final void display(){
        //template
        open();
        print();
        close();
    }
}
