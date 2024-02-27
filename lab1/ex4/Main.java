package ex4;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int numar1 = random.nextInt(30) + 1;
        int numar2 = random.nextInt(30) + 1;

        System.out.println("PRIMUL NUMAR GENERAT: " + numar1);
        System.out.println("AL DOILEA NUMAR GENERAT: " + numar2);

        int cmmdc = calculCMMD(numar1, numar2);

        System.out.println("CMMDC-ul: " + cmmdc);
    }

    public static int calculCMMD(int a, int b) {
        while (b != 0) {
            int aux = b;
            b = a % b;
            a = aux;
        }
        return a;
    }
}

