package br.com.aust.number.evenodd;

public class EvenOdd {

    public static void main(String[] args) {
        for (int number = 0; number < 100; number++) {
            if( isEven(number) ){
                System.out.println("Even: "+number);
            }else{
                System.out.println("Odd: "+number);
            }
        }
    }

    private static boolean isEven(int number) {
        return (number & 1) == 0;
    }
}
