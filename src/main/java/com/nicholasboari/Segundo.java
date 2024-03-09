package com.nicholasboari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número positivo:");
        int n = scan.nextInt();

        if (n < 0) {
            throw new RuntimeException("Deve ser positivo!");
        }

        List<Integer> resultado = new ArrayList<>();
        int anterior = 0;
        int atual = 1;

        resultado.add(anterior);
        if (n > 0) {
            resultado.add(atual);
        }

        for (int i = 2; i < n; i++) {
            int proximo = anterior + atual;
            resultado.add(proximo);
            anterior = atual;
            atual = proximo;
        }
        resultado.forEach(x -> System.out.print(x + " "));
    }
}