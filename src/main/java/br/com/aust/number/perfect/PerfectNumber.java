package br.com.aust.number.perfect;

public class PerfectNumber {

    public static void main(String args[]){
        for(int number=1; number<=100; number++){
            if( isPerfect(number) ){
                System.out.println("Perfect Number: "+ number);
            }
        }
    }
    
    public static boolean isPerfect(int number){
        int total = 0;
        for(int i=1; i<number; i++){
            if(number%i==0){
                total += i;
            }
        }
        return (total == number);
    }
}
