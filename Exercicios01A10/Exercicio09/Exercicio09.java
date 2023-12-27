/*Escreva um programa que calcule o perímetro e a área de um retângulo,
* utilizando as fórmulas P = 2(l + c) e A = lc, onde l é a largura e c é o
* comprimento*/

package Exercicios100.Exercicios01A10.Exercicio09;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double larguraRetangulo;
        double comprimentoRetangulo;
        double perimetroRetangulo;
        double areaRetangulo;

        System.out.print("Digite a largura do restangulo: ");
        larguraRetangulo = input.nextDouble();
        System.out.print("Digite o comprimento do restangulo: ");
        comprimentoRetangulo = input.nextDouble();

        perimetroRetangulo = 2 * (larguraRetangulo + comprimentoRetangulo);
        areaRetangulo = larguraRetangulo * comprimentoRetangulo;

        System.out.printf("O perímetro do retângulo  é: %.2f\n", perimetroRetangulo);
        System.out.printf("A área do retângulo é: %.2f", areaRetangulo);

        input.close();
    }
}
