package cn.edu.seu.wh.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        //编辑文档
        builder.makeTitle("王欢自夸！");//标题
        builder.makeString("学习");//字符串
        builder.makeItems(new String[]{ //条目
                "聪明",
                "努力",
                "认真"
        });
        builder.makeString("LOL");
        builder.makeItems(new String[]{
                "carry",
                "ad carry",
                "国服第一卡莎"
        });
        builder.close();//结束编辑
    }
}
