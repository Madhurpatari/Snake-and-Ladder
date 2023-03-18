package SnakeAndLadder;
public class Dice {
    public static int roll(){
        int min =1;
        int max =6;
        double r =Math.random();
        int num = (int)(r*max)+min;
        return num;
    }
}
