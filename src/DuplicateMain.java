/*По первому заданию: сделать реализацию только с HashMap, без Set сделать задание 1.3
По первому и второму заданию: реализовать проверку вводимых данных (если пользователь ввел недопустимое значение,
вывести ему сообщение об ошибке и попросить повторить ввод)
*/
public class DuplicateMain {
    public static void main(String[] args) {

        DuplicateNumbers dup = new DuplicateNumbers();
        dup.DuplicateNumbers();

        DuplicateNumbersCount dupNCo = new DuplicateNumbersCount();
        dupNCo.DuplicateNumbersCount(dup.getStr());

//        Polindrom pol = new Polindrom();
//        pol.Polindrom();
    }
}
