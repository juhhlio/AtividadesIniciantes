/*Faça um programa que leia um número e informe se ele é positivo, negativo ou zero*/

package Exercicios100.Exercicios21A30.Exercicio30;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroUsuario;
        String estadoNumero;

        System.out.print("Digite um número: ");
        numeroUsuario = input.nextInt();

        if (numeroUsuario > 0) {
            estadoNumero = "positivo";
        }
        else if (numeroUsuario < 0) {
            estadoNumero = "negativo";
        }
        else {
            estadoNumero = "zero";
        }

        System.out.printf("O número digitado é %s", estadoNumero);

        input.close();
    }
}
