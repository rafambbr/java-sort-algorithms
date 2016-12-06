package br.com.aust.number.fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        
        int[] fibonacciSequence = calcFibonacci(50);
        
        for (int number : fibonacciSequence) {
            System.out.println("N: " + number);
        }
    }

    private static int[] calcFibonacci(int number) {
        int sequence[] = new int[number];  
        for (int index = 0; index < number; index++) {
            if((index+1) > 2){
                int total = sequence[index-1] + sequence[index-2];
                sequence[index] = total;
            }else{
                sequence[index] = 1;
            }
        }
        return sequence;
    }
}
