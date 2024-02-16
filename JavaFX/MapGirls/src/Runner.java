import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {
        List<Girl> girls = List.of(new Girl("An", 20), new Girl("Bea", 20),
                new Girl("Bea", 25), new Girl("Diana", 25),
                new Girl("Zoë", 18), new Girl("Ekaterina", 18),
                new Girl("Bea", 20));//make a new List and add the elements to it

        Map<String, Girl> map = new HashMap<>();
        for (Girl girl : girls) {
            map.put(girl.getName(), girl);
        }//loop over the List and add each element to the Map using the name as the key
        System.out.printf(String.valueOf(map.size()), map);//print out the size of the Set and the Set itself
    }
}
