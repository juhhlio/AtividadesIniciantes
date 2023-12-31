/*Faça um programa que leia dois números e informe qual é o maior*/

package Exercicios100.Exercicios21A30.Exercicio27;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int primeiroNumero;
        int segundoNumero;
        int maiorNumero;
        int menorNumero;
        String valorMaior;
        String valorMenor;

        System.out.print("Digite o primeiro Número: ");
        primeiroNumero = input.nextInt();
        System.out.print("Digite o segundo Número: ");
        segundoNumero = input.nextInt();

        if (primeiroNumero > segundoNumero) {
            valorMaior = "primeiro";
            valorMenor = "segundo";
            maiorNumero = primeiroNumero;
            menorNumero = segundoNumero;
        }
        else {
            valorMaior = "segundo";
            valorMenor = "primeiro";
            maiorNumero = segundoNumero;
            menorNumero = primeiroNumero;
        }
        System.out.printf("O %s é o maior valor = %d\n", valorMaior, maiorNumero);
        System.out.printf("O %s é o menor valor = %d", valorMenor, menorNumero);

        input.close();
    }
}
