package ex2;

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
    }
}
