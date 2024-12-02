import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);


        System.out.println("\nTask 2");
        String fullNameForReport = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета " + fullNameForReport);


        System.out.println("\nTask 3");

        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName.replace("ё", "е"));
    }
}