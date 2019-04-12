package cn.edu.seu.wh.strategy;

import java.util.Random;

public class ProbStrategy implements Strategy{
    private Random random;

    public ProbStrategy(int seed) {
        this.random = new Random(seed);
    }

    private int prevHandvalue=0;
    private int currentHandvalue=0;
    private int[][] history={
            {1,1,1},
            {1,1,1},
            {1,1,1}
    };




    private int getSum(int hv){
        int sum=0;
        for(int i=0;i<3;i++){
            sum += history[hv][i];
        }
        return sum;
    }



    @Override
    public Hand nextHand() {
        int bet=random.nextInt(getSum(currentHandvalue));
        int handvalue=0;
        if(bet<history[currentHandvalue][0]){
            handvalue=0;
        }else if(bet<history[currentHandvalue][0]+history[currentHandvalue][1]){
            handvalue=1;
        }else{
            handvalue=2;
        }
        prevHandvalue=currentHandvalue;
        currentHandvalue=handvalue;
        return Hand.getHand(currentHandvalue);
    }

    @Override
    public void study(boolean win) {
        if(win){
            history[prevHandvalue][currentHandvalue]++;
        }else{
            history[prevHandvalue][(currentHandvalue+1)%3]++;
            history[prevHandvalue][(currentHandvalue+2)%3]++;
        }
    }
}
