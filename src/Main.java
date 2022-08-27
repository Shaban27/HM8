public class Main {

    public static void main(String[] args) {
        printLeapYear(2021);
        printOperatingSystem(2015, 0);
        printDeliveryDistance(95);
    }

    public static void printLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "год високосный");
        } else {
            System.out.println(year + "год не високосный");
        }
    }

    public static void printOperatingSystem(int product, int clientOS) {
        String version = product<2015? " lite" : "";
        String os = clientOS ==0? "iOS" : " Android";
        System.out.printf("УСТАНОВИТЬ %S ВЕРСИЮ ПРИЛОЖЕНИЯ ДЛЯ %S ПО ССЫЛКЕ", version, os);
        if (product < 2015) {
            System.out.print("Установить lite");
        } else {
            System.out.print("Установить обычную");
        }
        if (clientOS == 1) {
            System.out.println(" iOS ");
        } else {
            System.out.println(" Android ");

        }
    }

    public static void printDeliveryDistance(int distance) {
        int deliveryDays = 1;
        int lastDistance = 40;
        int firstDistance = 20;
        if (distance >= firstDistance) {
            deliveryDays = (Math.abs((distance - firstDistance) / lastDistance) + 2);
        }
        System.out.println("Потребуется дней - " + deliveryDays);
     return;
    }}



