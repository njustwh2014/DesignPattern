package cn.edu.seu.wh.prototype.implinstance;

import cn.edu.seu.wh.prototype.framework.Product;

public class MassageBox implements Product {
    private char decochar;

    public MassageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length=s.getBytes().length;
        //之所以不用 s.length(),这个返回的是字符串字符数，而中文是一个字符两个字节
        for(int i=0;i<length+4;i++){
            System.out.print(decochar);
        }
        System.out.println(" ");
        System.out.println(decochar+" "+s+" "+decochar);
        for(int i=0;i<length+4;i++){
            System.out.print(decochar);
        }
        System.out.println(" ");
    }

    @Override
    public Product createClone() {
        Product p=null;
        try{
            p=(Product)clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }
}
