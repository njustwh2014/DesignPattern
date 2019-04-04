package cn.edu.seu.wh.factory.idcard;

import cn.edu.seu.wh.factory.framework.Product;

public class IDCard extends Product {
    //继承自framework包的Product 实现具体的use
    private String owner;

    IDCard(String owner) {
        System.out.println("正在制作："+owner+"的IDCard!");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("正在使用："+owner+"的IDCard!");
    }

    public String getOwner() {
        return owner;
    }
}
