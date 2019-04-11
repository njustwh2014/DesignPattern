package cn.edu.seu.wh.bridge;

public class StringDisplayImpl extends DisplayImpl {
    private String string;//要显示的字符串
    private int width;//按字节单位算出要显示的字符串大小

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width=string.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|"+string+"|");
    }

    @Override
    public void rawclose() {
        printLine();

    }

    public void printLine(){
        System.out.print('+');
        for(int i=0;i<width;i++){
            System.out.print('-');
        }
        System.out.println("+");
    }
}
