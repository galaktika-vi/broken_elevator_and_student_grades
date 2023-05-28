import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите программу для выполнения:");
            System.out.println("1. Программа для подсчета количества подъемов лифта.");
            System.out.println("2. Программа для подсчета количества оценок.");
            System.out.println("0. Выйти из программы.");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    numberOfLifts(200, 50, 1);
                    break;
                case 2:
                    System.out.print("Введите количество учеников: ");
                    int n = scanner.nextInt();
                    counter(n);
                    break;
                case 0:
                    System.out.println("Программа завершена.");
                    return;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
                    break;
            }
        }
    }

    public static void numberOfLifts(int floor, int stepUp, int stepDown) {
        int currentFloor = 0;
        int numberOfLifts = 0;
        System.out.println("Начинаем движение лифта...");
        while (currentFloor < floor) {
            currentFloor += stepUp;
            numberOfLifts++;
            System.out.println("Лифт поднимается. Текущий этаж: " + currentFloor);
            if (currentFloor < floor) {
                currentFloor -= stepDown;
                System.out.println("Лифт спускается. Текущий этаж: " + currentFloor);
            }
        }
        System.out.println("Лифт достиг верхнего этажа за " + numberOfLifts + " подъема(ов).");
    }

    public static void counter(int n) {
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= n; i++) {
            System.out.print("Введите оценку для ученика " + i + ": ");
            String grade = scanner.next();
            switch (grade.toUpperCase()) {
                case "A":
                    countA++;
                    break;
                case "B":
                    countB++;
                    break;
                case "C":
                    countC++;
                    break;
                case "D":
                    countD++;
                    break;
                default:
                    System.out.println("Некорректная оценка. Попробуйте снова.");
                    i--;
                    break;
            }
        }

        System.out.println("Количество оценок:");
        System.out.println("A: " + countA);
        System.out.println("B: " + countB);
        System.out.println("C: " + countC);
        System.out.println("D: " + countD);
    }
}
