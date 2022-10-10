package ad211.cheban;

import java.util.Scanner; // используем для считывания информации, введенной пользователем
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть слово: ");
        String n = in.next();
        char arr[] = n.toCharArray();
        int max = 0;
        int k = 0;
        for (int i = 0; i < n.length() - 1; i++) { // ищем самый длинный блок
            if (arr[i] == arr[i + 1]) { // сравниваем элементф
                k++;
                if (k > max)
                    max = k;
            }
            if (arr[i] != arr[i+1]) // сбрасываем значение k если одинаковых элементов больше нет
                k = 0;
        }
        System.out.println("Найдовший блок: " + (max+1)); // выводим результат
    }
}