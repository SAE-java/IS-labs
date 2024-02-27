package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("LUNGIME: ");
        int lungime = scanner.nextInt();

        System.out.print("LATIME: ");
        int latime = scanner.nextInt();

        int perimetru = 2 * (lungime + latime);
        int aria = lungime * latime;

        System.out.println("PERIMETRU =  " + perimetru);
        System.out.println("ARIA =  " + aria);

        scanner.close();
    }
}

