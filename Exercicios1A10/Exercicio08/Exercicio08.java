/*Escreva um programa que calcule o delta de uma equação de segundo
* grau (Δ = b² - 4ac)*/

package Exercicios100.Exercicios1A10.Exercicio08;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double coeficienteA;
        double coeficienteB;
        double coeficienteC;
        double valorDelta;

        System.out.print("Digite o coeficente de A: ");
        coeficienteA = input.nextDouble();
        System.out.print("Digite o coeficente de B: ");
        coeficienteB = input.nextDouble();
        System.out.print("Digite o coeficente de C: ");
        coeficienteC = input.nextDouble();

        valorDelta = Math.pow(coeficienteB, 2) - 4 * coeficienteA * coeficienteC;

        System.out.printf("O valor do delta: %.2f", valorDelta);

        input.close();
    }
}
