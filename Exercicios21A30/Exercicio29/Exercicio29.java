/*Faça um programa que leia um número e informe se ele é par ou ímpar.*/

package Exercicios100.Exercicios21A30.Exercicio29;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroUsuario;
        int imparPar;
        String imparparEscolhido;

        System.out.print("Digite um número: ");
        numeroUsuario = input.nextInt();

        imparPar = numeroUsuario % 2;

        if (imparPar == 1) {
            imparparEscolhido = "ímpar";
        }
        else {
            imparparEscolhido = "par";
        }
        System.out.printf("O número %d é um número %s.", numeroUsuario, imparparEscolhido);

        input.close();
    }
}
