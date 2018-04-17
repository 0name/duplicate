import java.util.HashSet;
import java.util.Scanner;

public class DuplicateNumbers {

    public void DuplicateNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        String str = sc.nextLine();
        System.out.println("Your string:\n" + str );

//        char[]chArray = str.toCharArray();
        System.out.println(str);

        String[] newStr = str.split(" ");

        System.out.println(newStr);
    }
}
