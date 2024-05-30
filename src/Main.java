import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 - калькулятор, 2- поиск максимального слова ");
        int c = scanner.nextInt();
        switch (c) {
            case 1: calculator();
                break;
            case 2: wordMax();
                break;
        }
    }
    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию ");
        String operation = scanner.next();
        System.out.println("Введите первое дробное число ");
        float num1 = scanner.nextFloat();
        System.out.println("Введите второе дробное число ");
        float num2 = scanner.nextFloat();
        switch (operation) {
            case "+":
                System.out.printf("a + b = %.4f", num1 + num2);
                break;
            case "-":
                System.out.printf("a - b = %.4f", num1 - num2);
                break;
            case "*":
                System.out.printf("a * b = %.4f", num1 * num2);
                break;
            case "/":
                System.out.printf("a / b = %.2f", num1 / num2);
                break;
        }
    }

    public static void wordMax() {
        Scanner scanner = new Scanner(System.in);

        int stringMax = 0;
        int indexMax = 0;
        System.out.printf("Введите количество вводимых слов: ");
        int n = scanner.nextInt();
        String [] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите слово №%d ",i+1);
            stringArray[i] = scanner.next();
            if (stringMax < stringArray[i].length()){
                stringMax = stringArray[i].length();
                indexMax = i;
            }
        }
        System.out.printf("Самое длинное слово расположено на позиции %s",stringArray[indexMax]);
    }
}