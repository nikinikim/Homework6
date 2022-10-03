public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
        Task9();

        }
    public static void Task1() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
    }
    public static void Task2() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Итерация цикла " + i);
        }
    }
    public static void Task3() {
        for (int i = 0; i < 17; i+= 2) {
            System.out.println("Итерация цикла " + i);
        }
    }
    public static void Task4() {
        for (int i = 10; i >= -10; i--) {
            System.out.println("Итерация цикла " + i);
        }
    }
    public static void Task5() {
        for (int i = 1904; i <= 2096; i+=4) {
            System.out.println(i + " год является високосным");
        }
    }
    public static void Task6() {
        for (int i = 7; i <= 98; i+=7) {
            System.out.print(i + " ");
            System.out.println(" ");
        }
    }
    public static void Task7() {
        for (int i = 1; i <= 512; i*= 2) {
            System.out.print(i + " ");
            System.out.println(" ");
        }
    }
    public static void Task8() {
        int savings = 29000;
        int annualSavings = 0;
        for (int i = 1; i <=12; i++){
            annualSavings = annualSavings + annualSavings / 100;
            annualSavings = annualSavings + savings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + annualSavings + " рублей");
        }
    }
    public static void Task9() {
        int total = 0;
        for (int i = 1; i <= 30; i++) {
            total++;
            if (total % 3 == 0 && total % 5 != 0) {
                System.out.println(i + ": ping");
            } else if (total % 5 == 0 && total % 3 != 0) {
                    System.out.println(i + ": pong");
            } else if (total % 3 == 0 && total % 5 == 0) {
                System.out.println(i + ": ping pong");
            } else {
                System.out.println(i + ":");
            }

        }

    }
}