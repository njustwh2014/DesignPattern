package cn.edu.seu.wh.builder;

public class Main {

    public static void main(String[] args){
        if(args.length!=1){
            usage();
            System.exit(0);
        }
        if(args[0].equals("text")){
            TextBuilder tb=new TextBuilder();
            Director d=new Director(tb);
            d.construct();
            System.out.println(tb.getResult());
        }
        else if(args[0].equals("html")){
            HTMLBuilder hb=new HTMLBuilder();
            Director d=new Director(hb);
            d.construct();
            System.out.println(hb.getResult());
        }else{
            usage();
            System.exit(0);
        }
    }
    public static void usage(){
        System.out.println("usage: java Main text   编写文本文档");
        System.out.println("usage: java Main html   编写HTML文档");
    }

}
