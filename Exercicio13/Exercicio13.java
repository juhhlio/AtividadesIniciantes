/*Escreva um programa que calcule o trabalho realizado por uma força que atua sobre um objeto, utilizando a fórmula
* T = F * d, onde T é o trabalho, F é a força aplicada e d é a distância percorrida pelo objeto.*/
package Exercicios100.Exercicio13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double forcaAplicada;
        double distanciaPercorrida;
        double trabalho;

        System.out.print("Digite a força aplicada: ");
        forcaAplicada = input.nextDouble();
        System.out.print("Digite a distância percorrida pelo objeto: ");
        distanciaPercorrida = input.nextDouble();

        trabalho = forcaAplicada * distanciaPercorrida;

        System.out.printf("O trabalho realizado por uma força que átua sobre o objeto foi: %.2f",trabalho);

        input.close();
    }
}
