import java.util.ArrayList;
import java.util.Scanner;

public class Polindrom {
//    Пользователь вводит через пробел слова.
//  Найти все группы полиндром и вывести их в консоль
    public void Polindrom(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter words");
        String st = scan.nextLine();
        System.out.println("Entered words:\n" + st);

        String[] stArr = st.split(" "); // применим ArrayList т.к. по заданию нельзя пользоваться Set-ом
        ArrayList arrayListOfWords = new ArrayList();
        for (String someSt: stArr){ // в этом for нужно разделить каждое слово по буквам, которые засунуть в массив и потом сравнивать буквы

        }

    }
}
