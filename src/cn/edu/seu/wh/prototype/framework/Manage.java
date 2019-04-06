package cn.edu.seu.wh.prototype.framework;

import java.util.HashMap;

//Prototype模式中的client
public class Manage {
    private HashMap showcase=new HashMap();

    public void register(String name,Product proto){
        showcase.put(name,proto);
    }

    public Product create(String protoname){
        Product proto=(Product)showcase.get(protoname);
        //根据原型生成新的实例
        return proto.createClone();
    }
}
