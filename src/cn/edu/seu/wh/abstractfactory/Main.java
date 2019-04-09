package cn.edu.seu.wh.abstractfactory;

import cn.edu.seu.wh.abstractfactory.factory.Factory;
import cn.edu.seu.wh.abstractfactory.factory.Link;
import cn.edu.seu.wh.abstractfactory.factory.Page;
import cn.edu.seu.wh.abstractfactory.factory.Tray;

public class Main {

    public static void main(String[] args){
        if(args.length!=1){
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example: java Main cn.edu.seu.wh.abstractfactory.listfactory.ListFactory");
            System.exit(0);
        }
        Factory factory=Factory.getFactory(args[0]);

        Link people=factory.createLink("人民日报","http://www.people.com.cn/");
        Link gmw=factory.createLink("光明日报","http://www.gmw.cn/");

        Link baidu=factory.createLink("百度","http://www.baidu.com/");
        Link google=factory.createLink("谷歌","http://www.google.com/");


        Tray traynews=factory.createTray("日报");
        traynews.add(people);
        traynews.add(gmw);

        Tray traysearch=factory.createTray("搜索引擎");
        traysearch.add(baidu);
        traysearch.add(google);

        Page page=factory.createPage("LinkPage","王欢");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
