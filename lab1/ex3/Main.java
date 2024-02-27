package ex3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("DATI UN NUMAR: ");
        int numar = scanner.nextInt();

        System.out.println("DIVIZORII: " + numar);
        for (int i = 1; i <= numar; i++) {
            if (numar % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        if (numar <= 3) {
            System.out.println(numar + " ESTE PRIM");
        }
            for (int i = 2; i <= Math.sqrt(numar); i++) {
                if (numar % i == 0) {
                    System.out.println(numar + " NU ESTE PRIM");
                }
            else
            System.out.println(numar + " ESTE PRIM");
        }
        scanner.close();
    }
}
