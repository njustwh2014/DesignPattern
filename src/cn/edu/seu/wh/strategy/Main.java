package cn.edu.seu.wh.strategy;

public class Main {
    
    public static void main(String[] args){  
        if(args.length!=2){
            System.out.println("Usage: Java Main randomseed1 randomseed2");
            System.out.println("Example: Java Main 314 15");
            System.exit(0);
        }
        int seed1=Integer.parseInt(args[0]);
        int seed2=Integer.parseInt(args[1]);

        Player player1=new Player("王欢",new WinningStrategy(seed1));
        Player player2=new Player("James",new ProbStrategy(seed2));

        for(int i=0;i<1000;i++){
            Hand nexthand1=player1.nextHand();
            Hand nexthand2=player2.nextHand();
            if(nexthand1.isStrongerThan(nexthand2)){
                System.out.println("Winner: "+player1);
                player1.win();
                player2.lose();
            }else if(nexthand2.isStrongerThan(nexthand1)){
                System.out.println("Winner: "+player2);
                player1.lose();
                player2.win();
            }else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total Result:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());

    }
}
