//Escreva um programa que calcule a média aritmética de dois números.
package Exercicios100.Exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    static public void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double primeiraNota;
        double segundaNota;
        double mediaNotas;

        System.out.print("Digite a primeira nota: ");
        primeiraNota = input.nextDouble();
        System.out.print("Digite a segunda nota: ");
        segundaNota = input.nextDouble();

        mediaNotas = (primeiraNota + segundaNota) / 2;

        System.out.printf("A média das notas %.2f e %.2f é = %.2f", primeiraNota, segundaNota, mediaNotas);
        input.close();
    }
}
