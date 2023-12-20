/*Escreva um programa que calcule a área de um círculo a partir do raio,
* utilizando a fórmula A = πr² */

package Exercicios100.Exercicio07;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double raioCirculo;
        double areaCirculo;

        System.out.print("Digite o raio do círculo: ");
        raioCirculo = input.nextDouble();

        areaCirculo = 3.14 * Math.pow(raioCirculo,2);

        System.out.printf("A área do círculo é %.2fm²",areaCirculo);

        input.close();
    }
}
