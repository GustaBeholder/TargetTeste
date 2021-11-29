package br.com.gustavolemillion;

import java.util.Scanner;

public class InverterString {

    static String reverse(String frase) {
        String invertida = "";
        for (int i = frase.length() - 1;  0 <= i; i--) {
            invertida += frase.charAt(i);
        }
        return invertida;
    }

    public static void main(String[] args) {
        String frase = "Teste";

        String teste = reverse(frase);
        System.out.println(teste);
    }
}
