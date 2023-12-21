/*Escreva um programa que calcule a energia cinética de um objeto em movimento, utilizando a fórmula E = (mv²) / 2,
* onde E é a energia cinética, m é a massa do objeto e v é a velocidade. */

package Exercicios100.Exercicio12;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner input = new Scanner(System.in);

            double massaObjeto;
            double velocidade;
            double energiaCinetica;

            System.out.print("Digite a massa do obejto: ");
            massaObjeto = input.nextDouble();
            System.out.print("Digite a velocidade: ");
            velocidade = input.nextDouble();

            energiaCinetica = (massaObjeto * Math.pow(velocidade,2)) / 2;

            System.out.printf("A energia cinética de um objeto em movimento é: %.2f", energiaCinetica);

            input.close();
        }
}
