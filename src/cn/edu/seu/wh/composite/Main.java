package cn.edu.seu.wh.composite;

public class Main {

    public static void main(String[] args){
        try{
            System.out.println("Making root dir...");
            Directory rootdir=new Directory("root");
            Directory bindir=new Directory("bin");
            Directory tmpdir=new Directory("tmp");
            Directory usrdir=new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi",100));
            bindir.add(new File("latex",200));
            rootdir.printList();

        }catch (FileTreatmentException e){
            e.printStackTrace();
        }
    }
}
