package main;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 10/11/2020
 */

public class DataFil {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Velkommen til Grøntorvets lagersystem");
        System.out.println("Indlæser data...");
        DataFil dataFil = new DataFil();
        dataFil.save();
        dataFil.load();
    }


        public void save() throws FileNotFoundException  {

            Lager varelager = new Lager();
            // Gennemløb arrayet varelager.vareLager
            // For hvert element lav en  output.print
           Vare v1  = varelager.vareLager.get(0);

            java.io.File file = new java.io.File("data/varer.txt");
            // Create a file
            try {
                java.io.PrintWriter output = new java.io.PrintWriter(file);
                // Write formatted output to the file
                output.print("Bønner ");
                output.println(10);
                output.print("Æbler ");
                output.println(85);
                output.print("Humans ");
                output.println(10);

                // Close the file
                output.close();
            } catch (Exception e) {
                System.out.println("UPS, filen kan ikke skrives, lava en mappe der hedder data og prøv igen.");
            }

            System.out.println("Nu kører programmet videre. ");

        }

    public void load()  {
        // Create a File instance
        java.io.File file = new java.io.File("data/varer.txt");

        // Create a Scanner for the file
        try {
            Scanner input = new Scanner(file);

            // Read data from a file
            while (input.hasNext()) {
                String vare = input.next();
                int antal = input.nextInt();
                System.out.println(
                        vare + " " + antal);
            }

            // Close the file
            input.close();
        } catch (Exception e) {
            System.out.println("Uha, jeg har overlevet, programmet crashede ikke. ");
        }
    }
}

