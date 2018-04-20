import java.util.HashMap;
import java.util.Map;

public class DuplicateNumbersCount extends DuplicateNumbers{ // наследуемся от DuplicateNumbers, чтобы получить доступ к методу
//    Подсчитать количество повторящихся элементов в массиве с помощью HashMap

    public void DuplicateNumbersCount(String newStr2){
        System.out.println("Origin string:\n" + newStr2);
        String[] arr = newStr2.split(" ");
        HashMap<String, Integer> hashM = new HashMap<>();
        for (String someStr: arr )
            if (hashM.containsKey(someStr) ) {
                hashM.put(someStr, hashM.get(someStr)+1);
            } else {
                hashM.put(someStr, 1);
            }

        for(Map.Entry<String, Integer> entry : hashM.entrySet()) {
            System.out.println("Number " + entry.getKey()+ " is repeated " + entry.getValue() + " times");
        }
    }
}
