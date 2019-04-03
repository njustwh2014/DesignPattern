package cn.edu.seu.wh.template;

public class StringDisplay extends AbstractDisplay {
    //实现具体的处理
    private String s;
    private int width;

    public StringDisplay(String s) {
        this.s = s;
        this.width=s.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|"+s+"|");
    }

    @Override
    public void close() {
        printLine();
    }

    public void printLine(){
        System.out.print("+");
        for(int i=0;i<width;i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
