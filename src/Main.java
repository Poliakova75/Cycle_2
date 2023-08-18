public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("\nЗадача 1");
        int targetAmount = 2459000;
        int monthDeposit = 15000;
        int initialAmount = 0;
        int month = 0;

        while (initialAmount < targetAmount) {
            initialAmount += monthDeposit;
            month++;

            System.out.println("Месяц " + month + " сумма накоплений равна " + initialAmount + " рублей");
        }
    }

    public static void task2() {
        System.out.println("\nЗадача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
    }

    public static void task3() {
        System.out.println("\nЗадача 3");
        int population = 12_000_000;
        int birthRate = 17; // Рождаемость на 1000 человек
        int deathRate = 8; // Смертность на 1000 человек


        for (int year = 1; year <= 10; year++) {
            population = population + (birthRate - deathRate) * population / 1000;

            System.out.println("Год " + year + " численность населения составляет " + population);

        }
    }

    public static void task4() {
        System.out.println("\nЗадача 4");
        long initialDeposit = 15000L;
        long targetAmount = 12_000_000L;
        int months = 0;

        while (initialDeposit < targetAmount) {
            initialDeposit = (long) (initialDeposit * 0.07 + initialDeposit);
            months++;

            System.out.println("Месяц " + months + ": " + initialDeposit);
        }
        System.out.println("Количество месяцев: " + months);
    }

    public static void task5() {
        System.out.println("\nЗадача 5");
        long initialDeposit = 15000L;
        long targetAmount = 12_000_000L;
        int months = 0;

        while (initialDeposit < targetAmount) {
            initialDeposit = (long) (initialDeposit * 0.07 + initialDeposit);
            months++;

            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ": " + initialDeposit);
            }
        }
        System.out.println("Количество месяцев: " + months);
    }

    public static void task6() {
        System.out.println("\nЗадача 6");
        long initialDeposit = 15000L;
        var interestRate = 0.07;

        int halfYears = 0;
        int years = 1;

        while ( years <= 9) {
            years++;
            for (int months = 1; months <= 12; months++) {
                initialDeposit += initialDeposit * interestRate;

                if (months % 6 == 0) {
                    halfYears++;
                    System.out.println("Полгода " + halfYears + ": " + initialDeposit);
                }
            }
        }
    }

    public static void task7() {
        System.out.println("\nЗадача 7");
        int firstFriday = 6;
        int daysInMonth = 31;

        for (int day = firstFriday; day <= daysInMonth; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("\nЗадача 8");
        int startYear = 1822;
        int finalYear = startYear + 200;

        int cometYear = 0; // Год появления кометы

        for (int year = startYear; year <= finalYear; year++) {
            if (year % 79 == 0) {
                cometYear = year;
                System.out.println(cometYear);
            }
        }
        int nextCometYear = cometYear + 79;
        System.out.println(nextCometYear);
    }
}




