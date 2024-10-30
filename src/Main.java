public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println(" ");
        System.out.println("Задание 2:");
        for(int i = 10; i >= 1; i --){
            System.out.println(i);
        }
        System.out.println(" ");
        System.out.println("Задание 3:");
        for(int i = 0; i <= 17; i = i + 2){
            System.out.println(i);
        }
        System.out.println(" ");
        System.out.println("Задание 4:");
        for(int i = 10; i >= -10; i--){
            System.out.println(i);
        }
        System.out.println(" ");
        System.out.println("Задание 5:");
        for(int i = 1904; i <= 2094; i = i +4){
            System.out.println(i);
        }
        System.out.println(" ");
        System.out.println("Задание 6:");
        for(int i = 7; i <= 98; i = i +7){
            System.out.println(i);
        }
        System.out.println(" ");
        System.out.println("Задание 7:");
        for(int i = 1; i <= 512; i = i * 2){
            System.out.println(i);
        }
        System.out.println(" ");
        System.out.println("Задание 8:");
        for(int i = 1; i <= 12; i++){
            System.out.println("Месяц "+i+", сумма накоплений равна "+i*29000+" рублей");
        }
        System.out.println(" ");
        System.out.println("Задание 9:");
        double SumSave = 29000;
        double result = 0;
        double percent =  0.01;
        for(int i = 1; i <= 12; i++){
            result = result + SumSave * (1+percent);
            System.out.println("Месяц "+i+", сумма накоплений равна "+result+" рублей");
        }
        System.out.println(" ");
        System.out.println("Задание 10:");
        for(int i = 1; i <= 10; i ++){
            int a = 2 * i;
            System.out.println("2*"+i+"="+a);
        }
    }
}