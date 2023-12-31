/*Escreva um programa que solicite três números ao usuário e exiba o maior deles.*/

package Exercicios100.Exercicios21A30.Exercicio28;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int primeiroNumero;
        int segundoNumero;
        int terceiroNumero;
        int maiorNumero;
        int menorNumero;
        String maiorValor;
        String menorValor;

        System.out.print("Digite o primeiro Número; ");
        primeiroNumero = input.nextInt();
        System.out.print("Digite o segundo Número; ");
        segundoNumero = input.nextInt();
        System.out.print("Digite o terceiro Número; ");
        terceiroNumero = input.nextInt();

        if (primeiroNumero >= segundoNumero && primeiroNumero > terceiroNumero) {
            if (segundoNumero >= terceiroNumero) {
                maiorNumero = primeiroNumero;
                menorNumero = terceiroNumero;
                maiorValor = "primeiro";
                menorValor = "terceiro";
            }
            else {
                maiorNumero = primeiroNumero;
                menorNumero = segundoNumero;
                maiorValor = "primeiro";
                menorValor = "segundo";
            }
        }
        else if (segundoNumero >= primeiroNumero && segundoNumero > terceiroNumero) {
            if (primeiroNumero >= terceiroNumero) {
                maiorNumero = segundoNumero;
                menorNumero = terceiroNumero;
                maiorValor = "segundo";
                menorValor = "terceiro";
            }
            else {
                maiorNumero = segundoNumero;
                menorNumero = primeiroNumero;
                maiorValor = "segundo";
                menorValor = "primeiro";
            }
        }
        else {
            if (segundoNumero >= primeiroNumero) {
                maiorNumero = terceiroNumero;
                menorNumero = primeiroNumero;
                maiorValor = "terceiro";
                menorValor = "primeiro";
            }
            else {
                maiorNumero = terceiroNumero;
                menorNumero = segundoNumero;
                maiorValor = "primeiro";
                menorValor = "segundo";
            }
        }
        System.out.printf("O maior número é o %s que vale = %d\n", maiorValor, maiorNumero);
        System.out.printf("O menor número é o %s que vale = %d", menorValor, menorNumero);

        input.close();
    }
}
