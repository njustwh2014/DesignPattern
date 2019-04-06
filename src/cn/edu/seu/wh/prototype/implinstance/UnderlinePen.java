package cn.edu.seu.wh.prototype.implinstance;

import cn.edu.seu.wh.prototype.framework.Product;

public class UnderlinePen implements Product {
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        System.out.println("\""+s+"\"");
        for(int i=0;i<s.getBytes().length+2;i++){
            System.out.print(ulchar);
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
