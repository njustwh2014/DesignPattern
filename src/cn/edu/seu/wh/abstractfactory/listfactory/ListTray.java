package cn.edu.seu.wh.abstractfactory.listfactory;

import cn.edu.seu.wh.abstractfactory.factory.Item;
import cn.edu.seu.wh.abstractfactory.factory.Tray;

import java.util.Iterator;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer=new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption+"\n");
        buffer.append("<ul>\n");
        Iterator it=tray.iterator();//这时Tray已被继承
        while(it.hasNext()){
            Item item=(Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}
