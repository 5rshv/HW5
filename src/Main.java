public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Задание 1:");
        int SumSave = 15000;
        int result = 0;
        int i = 0;
        while (result <= 2_459_000) {
            result = result + SumSave;
            i = i + 1;

        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + result + " рублей");

        System.out.println(" ");
        System.out.println("Задание 2:");
        int a = 0;
        int b = 11;
        while (a < 10) {
            a = a + 1;
            System.out.print(a + " ");
        }
        System.out.println();
        while (b > 1) {
            b = b - 1;
            System.out.print(b + " ");
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Задание 3:");
        int People = 12_000_000;
        int yesrs = 1;
        double smertnost = (double) 8 / 1000 * People;
        double rozhdaemost = (double) 17 / 1000 * People;
        while (yesrs < 10) {
            yesrs = yesrs + 1;
            People = (int) (Math.round(People + rozhdaemost - smertnost));
        }
        System.out.print("Год " + yesrs + ", численность населения составляет " + People);


        System.out.println(" ");
        System.out.println("Задание 4,5:");
        double SumSaveVas = 15000;
        double resultVas = 0;
        int month = 1;
        double percent = 0.07;
        resultVas = SumSaveVas;

        while (resultVas <= 12_000_000) {
            resultVas += percent * resultVas;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f\n", month, resultVas);
            }
            month++;
        }


        System.out.println(" ");
        System.out.println("Задание 6:");
        double SumSaveVasilii = 15000;
        double resultVasilii = 0;
        int mesyac = 1;
        double percentVas = 0.07;
        resultVasilii = SumSaveVasilii;

        while (mesyac <= 108) {
            resultVasilii += percentVas * resultVasilii;
            if (mesyac % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f\n", mesyac, resultVasilii);
            }
            mesyac++;
        }

        System.out.println(" ");
        System.out.println("Задание 7:");
        int friday = 7;
        while (friday <= 31) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет. \n", friday);
            friday += 7;
        }

        System.out.println(" ");
        System.out.println("Задание 8:");
        int cometPeriod = 79;
        int yearsNow = 2024;
        int yearsStart = yearsNow-200;
        int yearsEnd = yearsNow+100;

        int years = yearsStart;
        while ( years <= yearsEnd) {
                    if (years % cometPeriod == 0){
                        System.out.println(years);
                    }
                    years++;
        }
    }
}
