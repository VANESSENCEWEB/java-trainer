package com.exemplo;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("=== Calculadora Simples ===");

        System.out.print("Digite o primeiro número: ");
        double a = leia.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = leia.nextDouble();

        System.out.println("\nResultados:");
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));

        if (b != 0) {
            System.out.println("Divisão: " + (a / b));
        } else {
            System.out.println("Não dá pra dividir por zero!");
        }

        leia.close();
    }
}