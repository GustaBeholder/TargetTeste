package br.com.gustavolemillion;

import java.util.Scanner;

public class Fibonacci {


    public static void main(String[] args) {
        int valorInformado;
        int a = 0, b = 1, c;
        boolean pertence = false;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um valor para saber se pertence a sequência de Fibonacci");
        valorInformado = ler.nextInt();

        System.out.println(a+", "+b);
        do{
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);

            if( valorInformado == c){
                System.out.println("O valor pertence a sequência!");
                pertence = true;
            }
        }while(c < valorInformado);

        if(!pertence){
            System.out.println("Valor não pertence a sequência!");
        }

    }

}
