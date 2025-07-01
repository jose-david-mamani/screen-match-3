package com.alura.screenmatch;

import java.util.ArrayList;
import java.util.Scanner;

public class ClaseDePrueba {
    public static void main(String[] args) {

        Scanner cdScanner = new Scanner(System.in);



        System.out.println("de cuantos espacios va a ser la lista de nombres");
        int ioNumero = cdScanner.nextInt();
        System.out.println("ahora entra en un bucle hasta que termine de llenar a su lista");

        String[] listaNombres = new String[ioNumero];

        for (int i = 0; i < ioNumero; i++) {
            System.out.println("ingrese el nombre");
            String io = cdScanner.next();
            listaNombres[i] = io;
            System.out.println(listaNombres[i]);
            System.out.println();

        }

    }
}
