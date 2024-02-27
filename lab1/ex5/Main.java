package ex5;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int numar = random.nextInt(21);

        System.out.println("NUMARUL GENERAT: " + numar);

        if (apartineFibonacci(numar)) {
            System.out.println("APARTINE SIRULUI FIBONACCI");
        } else {
            System.out.println("NU APARTINE SIRULUI FIBONACCI");
        }
    }
    public static boolean apartineFibonacci(int numar) {
        int fibonacciPrecedent = 0;
        int fibonacciCurent = 1;

        while (fibonacciCurent < numar) {
            int suma = fibonacciPrecedent + fibonacciCurent;
            fibonacciPrecedent = fibonacciCurent;
            fibonacciCurent = suma;
        }

        return fibonacciCurent == numar;
    }
}

