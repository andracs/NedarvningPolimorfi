package fruits;

import main.*;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */

public class Apple extends Frugt implements Konserver, Bearbejde {

    public String sort = "Golden Delicious";
    public String type = "spiseæble";
    public boolean moden = false;


    @Override
    public void konserver() {
        System.out.println("Æbler laves til æblemos.");
    }

    @Override
    public void bearbejde() {
        System.out.println("Æbler skralles.");
    }
}
