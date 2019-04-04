package cn.edu.seu.wh.factory;

import cn.edu.seu.wh.factory.framework.Factory;
import cn.edu.seu.wh.factory.framework.Product;
import cn.edu.seu.wh.factory.idcard.IDCardFactory;

public class Main {
    
    public static void main(String[] args){
        Factory idCardFactory= new IDCardFactory();
        Product wanghuan=idCardFactory.create("wanghuan");
        Product james=idCardFactory.create("james");
        wanghuan.use();
        james.use();
    }
}
