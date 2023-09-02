import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean work = true;

        while (work){
            System.out.println("Введите дробное число: ");
            try{
                float fNumber = Float.parseFloat(scanner.nextLine());
                System.out.printf("Введенное число равно %f\n", fNumber);
                work = false;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод. Введите дробное число.");
            }
        }
    }
}