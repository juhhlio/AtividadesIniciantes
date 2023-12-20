//Escreva um programa que calcule a média geométrica entre três números informados pelo usuário
package Exercicios100.Exercicio04;


import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double primeiroNumero;
        double segundoNumero;
        double terceiroNumero;
        double mediaGeometricaNumeros;

        System.out.print("Digite o primeiro número: ");
        primeiroNumero = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        segundoNumero = input.nextDouble();
        System.out.print("Digite o terceiro número: ");
        terceiroNumero = input.nextDouble();

        mediaGeometricaNumeros = Math.cbrt(primeiroNumero * segundoNumero * terceiroNumero);

        System.out.println(mediaGeometricaNumeros);
    }
}
