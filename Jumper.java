package SnakeAndLadder;

public class Jumper {
    Coordinates start;
    Coordinates end;
    String name;

    Jumper(Coordinates start, Coordinates end){
        this.start =start;
        this.end = end;

        if(start.rn > end.rn)
            this.name = "ladder";
        else 
            this.name = "snake";
    }

    /*
    snake
    start->[0,1](99), End->[9, 9](10)
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append("\n");
        sb.append("Start->").append(start.toString()).append("\n");
        sb.append("End->").append(end.toString());
        return sb.toString();
    }

}

