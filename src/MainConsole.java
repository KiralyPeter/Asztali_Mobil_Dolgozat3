/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlás esetén jelölje meg, ki, mikor.
 * Refaktorálva: 2024-02-26, Király Péter
 */

import java.util.Scanner;

public class MainConsole {
    /*
     * A csoni objektum osztáj tagjává kellen tenni.
     * Meg fontolandü a egy try() utasításba zárása is,
     * így le lesz zárva biztosan.
     * Ezzel valamit kezdünk.
     * Most jó lesz így.
     */
    /* Szállítási költségecske tárolása a memóriában */

    String szallitas = "";
    String nev = "";
    String mennyiseg = "";
    Scanner bekeres;
    Koltseg koltseg;

    public MainConsole() {

        diszsorKiiratas();
        bekeres = new Scanner(System.in);
        bekeresIndul();
        koltsegMentes();

    }

    private void diszsorKiiratas() {
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.printf("║%17s%25s\n", "Projekt költsége", "║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    private void bekeresIndul() {
        szallitas = bemenet("Szállítási költség: ");
        nev = bemenet("Üzleti költség: ");
        mennyiseg = bemenet("Javítási költség: ");
    }

    private String bemenet(String msg) {
        System.out.println("──────────────────────────────────────────");
        System.out.print(msg);
        String inData = bekeres.nextLine();
        return (inData);
    }

    private void koltsegMentes() {
        koltseg = new Koltseg(szallitas, nev, mennyiseg);
        Filehandler file = new Filehandler();
        file.iras(koltseg);
    }
}
