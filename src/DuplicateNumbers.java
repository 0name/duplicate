import java.util.*;

public class DuplicateNumbers {
    String str;

    public String getStr() {
        return str;
    }

    //  Пользователь вводит набор чисел в виде одной строки.
    public void DuplicateNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        str = sc.nextLine();    // все введенные данные сохраняются одной строкой в переменной str
        System.out.println("Your string:\n" + str );

//  Избавляемся от повторяющихся элементов в строке и вывести результат на экран
/*      I-способ через обычный Set - т.к. Set исключает повторы
        String[] newStr = str.split(" ");  // разделяем строку по " " и записываем каждый получившийся элемент в массив newStr
        Set<String> setStr = new HashSet<>();
        for(String sss: newStr){
            setStr.add(sss);
        }
        System.out.println("New string:\n" + setStr);
*/
//      II-ой способ с использованием HashMap (по заданию преподавателя)
        String[] strArr = str.split(" ");   // разделяем строку по " " и записываем каждый получившийся элемент в строковый массив newStr
        HashMap<String, Integer> hashMap1 = new HashMap<>();    // создаем HashMap
        for(String strC: strArr){               // цикл
                hashMap1.put(strC, null);          // запись данных в HashMap1
        }                                          // т.к. данные записываются в поле ключ - они записываются без повторов,
                                                    // потому что ключ - это уникальное значение

        System.out.println("String without repeating: ");
        for (Map.Entry entry : hashMap1.entrySet()) {
            System.out.print(entry.getKey() + " ");
        }
        System.out.println();
    }
}
