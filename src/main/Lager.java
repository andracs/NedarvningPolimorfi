/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 11/11/2020
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Lager {

    ArrayList<Vare> vareLager = new ArrayList<Vare>();

    public void fyldOp() { // LEVEL1

        // Den ene måde
        Vare b1 = new Bønner();
        vareLager.add(b1);

        // En anden måde kunne være
        vareLager.add(new Bønner());

        // 77 bønner
        // Hvor mange skal jeg lave? 27
        for (int i = 0; i < 27; i++) {
            vareLager.add(new Bønner());
        }

        // Indtast bønner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast bønner");
        while (true) {
            System.out.println("Vil du oprette en ny bønne? Indast JA.");
            if (scanner.nextLine().equals("JA")) {
                vareLager.add(new Bønner());
                System.out.println("Bønne indtastet");
            } else { break;}
        }

        // Manuelt
        vareLager.add(new Bønner());
        vareLager.add(new Bønner());
        vareLager.add(new Bønner());
        vareLager.add(new Bønner());
        vareLager.add(new Bønner());
        vareLager.add(new Bønner());
        vareLager.add(new Bønner());
        vareLager.add(new Bønner());
        vareLager.add(new Bønner());




    }

    public int antalVarer() { return 0; } // LEVEL1
    public void visVarer() { } // LEVEL2
    public int antalÆbler() { return 0; }  // LEVEL3
    public int antalAf(String type) { return 0; }  // LEVEL3


    public static void main(String[] args) {
        Lager l = new Lager();
        l.fyldOp();
    }
}
