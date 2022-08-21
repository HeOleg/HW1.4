public class Main {
    public static void main(String[] args) {

        //Задание 1
        int i = 1;
        while (i <= 10) {
            System.out.print(i++);
        }
        System.out.println("\n");
        int number = 10;
        for (number = 10; number >= 1; number--) {
            System.out.print(number);
        }
        System.out.println("\n");

        //Задание 2
        for(i=5;i<=31;i+=7) {
            System.out.println("Сегодня пятница" + i + "-е число. Необходимо подготовить отчет");
        }
        //Задание 3
        int currentYear=2022;
        int beginPeriod=currentYear-200;
        int endPeriod=currentYear+100;
        for(i=0;i<=endPeriod;i+=79){
            if(i>=beginPeriod){
                System.out.println(i);
            }
        }

    }
}