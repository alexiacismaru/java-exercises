package be.kdg.prog1;

public class A05Factorial {
    public static void main(String[] args) {


        long res = 1;

        for (int i = 1; i <=20 ; i++) {
	        res *= i;
	        System.out.println(i+"!\t= "+res);
        }
    }
}
