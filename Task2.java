import java.io.*;
import java.util.Scanner;
public class Task2 {
    public static void main (String[] args) throws IOException {
        double fahrenheit;
        double celsius;

        System.out.print("Input Temperature in Fahrenheit: ");
        // Зв’язок з клавіатурою
        Scanner sc = new Scanner(System.in);
        fahrenheit = sc.nextDouble();

        celsius = (fahrenheit - 32) * 5.0 / 9.0;

        System.out.println(fahrenheit + " by Fahrenheit");
        System.out.println(celsius + " by Celsius");
    }
}
