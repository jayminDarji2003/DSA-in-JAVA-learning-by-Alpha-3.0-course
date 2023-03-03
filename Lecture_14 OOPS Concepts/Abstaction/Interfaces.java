package Abstaction;

public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}


// creating interface

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,right,left,diagonal(in all sides)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,right,left");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,right,left , diagonal by one step");
    }
}
