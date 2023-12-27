/*Escreva um programa que calcule o IMC de um indivíduo, utilizando a
* fórmula IMC = peso / altura²*/

package Exercicios100.Exercicios01A10.Exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input =  new Scanner(System.in);

        double alturaUsuario;
        double pesoUsuario;
        double imcUsuario;

        System.out.print("Digite sua altura: ");
        alturaUsuario = input.nextDouble();
        System.out.print("Digite seu peso: ");
        pesoUsuario = input.nextDouble();

        imcUsuario = pesoUsuario / Math.pow(alturaUsuario, 2);

        System.out.printf("Seu imc: %.2f", imcUsuario);

        input.close();
    }
}
