package Week2;

public class Encoding {
    public static void main(String[] args){
        long nmbr = 6389L;
        int a = 6;
        int b =3;
        int c = 8;
        int d = 9;
        final int MAX = 9999;
        final int MIN = 1000;
        int fourDigitSum;
        System.out.print("Insert a four digit number:");
        nmbr = ((a * 1000) + (b * 100) + (c * 10) + (d*1));
        if(nmbr <= MAX && nmbr >= MIN) {
            System.out.print(nmbr);
        }
        fourDigitSum = a + b + c + d;
        System.out.println(fourDigitSum);
    }
}
