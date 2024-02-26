/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlás esetén jelölje meg, ki, mikor.
 * Refaktorálva: 2024-02-26, Király Péter
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Filehandler {

    public void iras(Koltseg koltseg) {

        try {
            FileWriter fajl = new FileWriter("adat.txt", true);
            fajl.write(koltseg.szallitas.toString());
            fajl.write(":");
            fajl.write(koltseg.uzlet.toString());
            fajl.write(":");
            fajl.write(koltseg.javitas.toString());
            fajl.write("\n");
            fajl.close();

        } catch (IOException e) {
            System.err.println("Hiba a fájl írása közben...");
            System.err.println(e.getMessage());
        }

    }

    /*
     * Valahova lehetne tenni egy adatbázis-kezelő
     * részt is. Ugyanaz a lenne a metódus ami,
     * kiírja a fájlba és kiírja adatbázisba.
     * Mármint a metódus neve lenne ugyanaz.
     * De lehetnek olyan általános osztály
     * ahol a konstruktor paraméterként kapná
     * meg az a típust, amivel tárolni kell.
     * Mármint, hogy adatbázisba, vagy fájlba.
     */
}
