package cn.edu.seu.wh.singleton.triple;

public class Triple {
    private static Triple[] triples=new Triple[]{
            new Triple(1),
            new Triple(2),
            new Triple(2)
    };
    private int id;
    private Triple(int id){
        System.out.println("生成了id："+id+"的实例！");
        this.id=id;
    }
    public static Triple getInstance(int id){
        return triples[id%3];
    }

    @Override
    public String toString() {
        return "Triple{" +
                "id=" + id +
                '}';
    }
}
