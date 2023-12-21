/*Escreva um programa que calcule a velocidade média de um objeto, utilizando a fórmula v = Δs/Δt, onde v é a
* velocidade média, Δs é a variação de espaço e Δt é a variação de tempo*/

package Exercicios100.Exercicio11;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double deslocamentoMetros;
        double intervaloTempo;
        double velocidadeMedia;

        System.out.print("Digite a variação de espaço (ΔS): ");
        deslocamentoMetros = input.nextDouble();
        System.out.print("Digite a variação de tempo (Δt): ");
        intervaloTempo = input.nextDouble();

        velocidadeMedia = deslocamentoMetros / intervaloTempo;

        System.out.printf("A velocidade média é: %.2f",velocidadeMedia);

        input.close();
    }
}
