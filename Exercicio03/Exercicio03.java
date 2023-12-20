//Crie um programa que calcule e exiba a média aritmética de três notas informadas pelo usuário.
package Exercicios100.Exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    static public void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double primeiraNota;
        double segundaNota;
        double terceiraNota;
        double mediaNotas;

        System.out.print("Digite a primeira nota: ");
        primeiraNota = input.nextDouble();
        System.out.print("Digite a segunda nota: ");
        segundaNota = input.nextDouble();
        System.out.print("Digite a terceira nota: ");
        terceiraNota = input.nextDouble();

        mediaNotas = (primeiraNota + segundaNota + terceiraNota) / 3;

        System.out.printf("A média entre as notas %.2f, %.2f e %.2f é = %.2f",
                primeiraNota, segundaNota, terceiraNota, mediaNotas);
    }
}
