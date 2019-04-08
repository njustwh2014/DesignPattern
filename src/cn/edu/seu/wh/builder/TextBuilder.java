package cn.edu.seu.wh.builder;

public class TextBuilder extends Builder {
    private StringBuffer buffer=new StringBuffer();
    private int i=1;

    @Override
    public void makeTitle(String title) {
        buffer.append("==============================================");//装饰线
        buffer.append("["+title+"]");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append(i+" "+str+"\n");//为str添加序号
        buffer.append("\n");
        i++;
    }

    @Override
    public void makeItems(String[] items) {
        for(int i=0;i<items.length;i++){
            buffer.append("  *"+items[i]+"\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("==============================================");//装饰线
    }

    public String getResult(){
        return buffer.toString();
    }
}
