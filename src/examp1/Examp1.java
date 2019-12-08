package examp1;

import java.util.*;

public class Examp1 {

    public static int n = 0;

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();           //все найденные числа будем записываем в этот массив
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scan.nextInt();
        n = a;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {    //перебираем "целые числа от 0 до бесконечности"
            if (i % razryad() == 0) {                    //проверка, делится ли число без остатка на количество разрядов (знаков) этого числа
                arr.add(i);
                if (arr.size() <= a) {                   //проверяем выведено ли уже N чисел (задается пользователем)
                    System.out.println(i + " ");
                } else {
                    break;
                }
            }
        }
    }

    public static int razryad() {                        //метод определяет разрядность вводимого числа
        return (int) Math.ceil(Math.log10(n+.5));
    }
}
