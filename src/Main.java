import fruits.*;
import jdk.nashorn.api.tree.ArrayLiteralTree;
import main.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */

public class Main {

    public static void main(String[] args)  {

        Apple a = new Apple();
        a.moden = true;
        a.coolDown();


        Peas p = new Peas();
        p.stykpris = 0.1;
        p.holdbarhed = new Date(1608768000);
        p.freeze();

        Konserver apple = (Konserver) new Apple();

        // SCENARIO 1 --> DER ER FEJL så kører 1 og 2 og 3
        // SCENARIO 2 --> DER ER IKKE FEJL så kører 1 og 3

        /*1*/ try {
            dummy();
            dummy();
            dummy();
        /*2*/
        } catch (SpeedTooHighException e) {
            System.out.println("La være med at køre for hurtigt.");
            // bil.hastighed = bil.hastighed-2;
        }
        /*3*/ finally {
            // Den kører altid
            // skal køre
        }

        /*4*/


    }

    public static void dummy() throws SpeedTooHighException {

        ArrayList<Mælk> mælkekarton = new ArrayList();
        ArrayList<Grønsag> grønneting;
        ArrayList<Vare> varelager = new ArrayList();
        ArrayList<Konserver> konserver = new ArrayList<>();

        Peas x = new Peas();

        // x objektet kan tage flere former --> Polymorfisme
        // den  kan både være Peas, Grønsag, Vare

        //mælkekarton.add(x);
        varelager.add(x);
        konserver.add(x);

        throw new SpeedTooHighException("Du må ikke køre mere end 150.");

        //Encapsulation
        //Inheritance
        //Polymorfisme

    }




}
