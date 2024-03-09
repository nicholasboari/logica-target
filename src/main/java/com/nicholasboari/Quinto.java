package com.nicholasboari;

import java.util.Scanner;

public class Quinto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva qualquer coisa");
        String string = scan.next();
        System.out.println("String invertida: " + inverterString(string));
    }

    public static String inverterString(String str) {
        String invertida = "";
        // invertida começa vazio e vai acrescentando elemento a cada iteração
        // cada elemento inserido começa do ultimo index para o primeiro
        for (int i = str.length() - 1; i >= 0; i--) {
            invertida += str.charAt(i);
        }
        return invertida;
    }
}