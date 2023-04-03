package Homework;
import java.util.Scanner;
public class HW_1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", giveMeNumber(i));
        System.out.printf("Введите второе число: ");
        int n = iScanner.nextInt();
        System.out.printf("Факториал этого числа: %d\n", factorialNum(n));
        iScanner.close();
    }

    public static int giveMeNumber(int a) {
        return (a * (a + 1)) / 2;
    }
        
    public static int factorialNum(int num) {
        int product = 1;
        for (int i = 1; i < num + 1; i++){
            product *= i;
        }
        return product;
    }
}
