import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateNumbers {
    String str;

    public String getStr() {
        return str;
    }

    //  Пользователь вводит набор чисел в виде одной строки.
    public void DuplicateNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        str = sc.nextLine();
        System.out.println("Your string:\n" + str );

//  Избавляемся от повторяющихся элементов в строке и вывести результат на экран
        String[] newStr = str.split(" ");
        Set<String> setStr = new HashSet<>();
        for(String sss: newStr){
            setStr.add(sss);
        }
        System.out.println("New string:\n" + setStr);
    }
}
