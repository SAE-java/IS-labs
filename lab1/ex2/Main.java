package ex2;

<<<<<<< HEAD
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        String fis_in = "ex2/in.txt";
        String fis_out = "ex2/out.txt";
        BufferedReader flux_in;
        PrintStream flux_out;
        flux_in = new BufferedReader(new FileReader(fis_in));
        flux_out = new PrintStream(new FileOutputStream(fis_out));

        int suma = 0, minim = Integer.MAX_VALUE, maxim = Integer.MIN_VALUE, nr = 0;
        float media;

        String line;
        while ((line = flux_in.readLine()) != null) {
            int numar = Integer.parseInt(line);

            suma = suma + numar;
            if (minim > numar)
                minim = numar;
            if (maxim < numar)
                maxim = numar;

            nr++;
        }

        media = (float) suma / nr;
        flux_out.println("SUMA: " + suma);
        flux_out.println("MAXIMUL: " + maxim);
        flux_out.println("MINIMUL: " + minim);
        flux_out.println("MEDIA ARITMETICA: " + media);

        flux_in.close();
        flux_out.close();
=======
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
>>>>>>> origin/master
    }
}
