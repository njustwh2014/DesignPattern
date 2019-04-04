package cn.edu.seu.wh.factory.idcard;

import cn.edu.seu.wh.factory.framework.Factory;
import cn.edu.seu.wh.factory.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private List owners=new ArrayList();

    public List getOwners() {
        return owners;
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product p) {
        owners.add(((IDCard)p).getOwner());
    }
}
