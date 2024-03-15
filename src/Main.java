import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        /* 1. Napisi program koji koristi do-while petlju da
        omoguci korisniku unos lozinke
        sve dok ne unese ispravnu lozinku.
        Ispravna lozinka moze biti unapred inicijalozovana.
        */


        int lozinka = 88456;
        int input;

        do {
            System.out.println("Unesite lozinku: ");
            input = s.nextInt();

        } while(input != lozinka);

        System.out.println("Lozinka je ispravna.");




        /*
        2.Napisi program koji koristi while petlju da omogući korisniku unos dva broja.
        Program treba da ispise rezultat deljenja prvog broja sa drugim.
        Petlja treba da se ponavlja sve dok je drugi broj razlicit od nule.
        */


        int broj1;
        int broj2 = 1;
        double rezultat;

        while(broj2 != 0) {

            System.out.println("Unesite jedan broj: ");
            broj1 = s.nextInt();

            System.out.println("Unesite drugi broj: ");
            broj2 = s.nextInt();

            rezultat = (1.0 * broj1) / broj2;
            System.out.println("Rezultat deljenja je: " + rezultat);

        }
        System.out.println("Kraj programa.");
        }

    }


