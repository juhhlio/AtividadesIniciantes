/*Escreva um programa que solicite ao usuário dois números e exiba a
* soma, subtração, multiplicação e divisão entre eles.*/

package Exercicios100.Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int primeiroNumero;
        int segundoNumero;
        int resultadoSoma;
        int resultadoSubtracao;
        int resultadoMultiplicacao;
        int resultadoDivisao;

        System.out.print("Digite o primeiro número: ");
        primeiroNumero = input.nextInt();
        System.out.print("Digite o segundo número: ");
        segundoNumero = input.nextInt();

        resultadoSoma = primeiroNumero + segundoNumero;
        resultadoSubtracao = primeiroNumero - segundoNumero;
        resultadoMultiplicacao = primeiroNumero * segundoNumero;
        resultadoDivisao = primeiroNumero / segundoNumero;

        System.out.println("A soma dos números " + primeiroNumero + " e " + segundoNumero + " é = " + resultadoSoma);
        System.out.println("A subtração dos números " + primeiroNumero + " e " + segundoNumero + " é = " + resultadoSubtracao);
        System.out.println("A multiplicação dos números " + primeiroNumero + " e " + segundoNumero + " é = " + resultadoMultiplicacao);
        System.out.println("A divisão dos números " + primeiroNumero + " e " + segundoNumero + " é = " + resultadoDivisao);

        input.close();

    }
}
