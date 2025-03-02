package Week3;

public class LoopOne {
    public static void main(String[] args){
        for (int counter = 1; counter <= 10000; counter++){
            if (counter % 5 ==0)
                System.out.println(counter);
        }
    }
}
