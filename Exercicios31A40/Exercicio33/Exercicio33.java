/*Faça um programa que leia três números, e informe se a soma deles é divisível por 5 ou não.*/

package Exercicios100.Exercicios31A40.Exercicio33;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double primeiroNumero;
        double segundoNumero;
        double terceiroNumero;
        double numeroTotal;
        double totalDivisil;

        System.out.print("Digite o primeiro número: ");
        primeiroNumero = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        segundoNumero = input.nextDouble();
        System.out.print("Digite o terceiro número: ");
        terceiroNumero = input.nextDouble();

        numeroTotal = primeiroNumero + segundoNumero + terceiroNumero;
        totalDivisil = numeroTotal % 5;

        System.out.printf("A soma dos 3 números é = %.1f%n",numeroTotal);

        if (totalDivisil == 0) {
            System.out.printf("A SOMA DOS NÚMEROS QUE DÁ %.1f É DIVISÍVEL POR 5.",numeroTotal);
        }
        else {
            System.out.printf("A SOMA DOS NÚMEROS QUE DÁ %.1f NÃO É  DIVISÍVEL POR 5.",numeroTotal);
        }
        input.close();
    }
}
