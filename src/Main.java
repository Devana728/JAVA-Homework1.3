import java.util.Scanner;

//Реализовать простой калькулятор
public class Main {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.printf("Введите выражение для вычисления:  ");
            String formula = scanner.nextLine().trim();
            scanner.close();

            String[] param = formula.split("\\+");
            if (param.length == 2) {
                System.out.println(Double.parseDouble(param[0]) + Double.parseDouble(param[1]));
                return;
            }
            param = formula.split("\\-");
            if (param.length == 2) {
                System.out.println(Double.parseDouble(param[0]) - Double.parseDouble(param[1]));
                return;
            }
            param = formula.split("\\*");
            if (param.length == 2) {
                System.out.println(Double.parseDouble(param[0]) * Double.parseDouble(param[1]));
                return;
            }
            param = formula.split("\\/");
            if (param.length == 2) {
                System.out.println(Double.parseDouble(param[0]) / Double.parseDouble(param[1]));
                return;

        }

        System.out.printf(" Произведение чисел от 1 до N = %s", mult);*/
    }
}
