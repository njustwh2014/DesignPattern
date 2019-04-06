package cn.edu.seu.wh.prototype.framework;

//Prototype模式中的原型
public interface Product extends Cloneable{
    public abstract void use(String s);
    public abstract Product createClone();
}
