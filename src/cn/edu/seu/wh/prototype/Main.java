package cn.edu.seu.wh.prototype;

import cn.edu.seu.wh.prototype.framework.Manage;
import cn.edu.seu.wh.prototype.framework.Product;
import cn.edu.seu.wh.prototype.implinstance.MassageBox;
import cn.edu.seu.wh.prototype.implinstance.UnderlinePen;

public class Main {

    public static void main(String[] args){
        Manage client=new Manage();
        MassageBox mb1=new MassageBox('*');
        MassageBox mb2=new MassageBox('/');
        UnderlinePen up=new UnderlinePen('~');
        client.register("王欢",mb1);
        client.register("RNG",mb2);
        client.register("ad",up);

        Product ad1=client.create("ad");
        Product wh=client.create("王欢");
        Product rng=client.create("RNG");
        ad1.use("卡莎是第一ad！");
        wh.use("王欢真帅");
        rng.use("uzi无敌");
    }
}
