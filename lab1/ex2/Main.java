package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți un număr natural: ");
        int numar = scanner.nextInt();

        System.out.println("Divizorii numărului " + numar + " sunt:");
        afiseazaDivizorii(numar);

        if (estePrim(numar)) {
            System.out.println(numar + " este un număr prim.");
        } else {
            System.out.println(numar + " nu este un număr prim.");
        }

        scanner.close();
    }

    // Metoda pentru a afișa divizorii unui număr
    public static void afiseazaDivizorii(int numar) {
        for (int i = 1; i <= numar; i++) {
            if (numar % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Trecem la o nouă linie după afișarea divizorilor
    }

    // Metoda pentru a verifica dacă un număr este prim
    public static boolean estePrim(int numar) {
        if (numar <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numar); i++) {
            if (numar % i == 0) {
                return false;
            }
        }
        return true;
    }
}
