package cn.edu.seu.wh.template;


public class Main {
    
    public static void main(String[] args){  
        AbstractDisplay cd=new CharDisplay('a');
        cd.display();
        AbstractDisplay sd=new StringDisplay("wanghuan");
        sd.display();
    }
}
