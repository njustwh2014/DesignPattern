package cn.edu.seu.wh.factory.framework;

public abstract class Factory {
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product p);
    //类似于template method 定义处理流程
    public final Product create(String owner){
        Product p=createProduct(owner);
        registerProduct(p);
        return p;
    }
}
