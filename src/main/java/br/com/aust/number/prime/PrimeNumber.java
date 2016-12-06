package br.com.aust.number.prime;

public class PrimeNumber {

    public static void main(String[] args) {
        for (int number = 1; number < 100; number++) {
            if( isPrime(number) ){
                System.out.println("Is prime: " + number);
            }
        }
    }

    private static boolean isPrime(int number) {
        int numberDiv = 0;
        for (int i = 1; i <= number; i++) {
            if( number%i == 0){
                numberDiv++;
            }
        }
        return (numberDiv == 2);
    }
}
