package cn.edu.seu.wh.abstractfactory.listfactory;

import cn.edu.seu.wh.abstractfactory.factory.Factory;
import cn.edu.seu.wh.abstractfactory.factory.Link;
import cn.edu.seu.wh.abstractfactory.factory.Page;
import cn.edu.seu.wh.abstractfactory.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title,author);
    }
}
