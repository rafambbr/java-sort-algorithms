package br.com.aust.number.perfectsquare;

public class PerfectSquare {
    
    public static void main(String[] args) {
        for(int number=1; number<=200; number++){
            if( isPerfectSquare(number) ){
                System.out.println("Perfect Square: "+number);
            }
        }
    }

    private static boolean isPerfectSquare(int number) {
        double square = Math.sqrt(number);
        return (square % 1) == 0; //Check if square is integer value
    }
}
