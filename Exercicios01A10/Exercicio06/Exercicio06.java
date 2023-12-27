/*Crie um programa que calcule e exiba o perímetro de um
* círculo, solicitando o raio ao usuário. */

package Exercicios100.Exercicios01A10.Exercicio06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double raioCirculo;
        double perimetroCirculo;

        System.out.print("Digite o raio do círculo: ");
        raioCirculo = input.nextDouble();

        perimetroCirculo = 2 * 3.14 * raioCirculo;

        System.out.printf("O perímetro do círculo é: %.2f", perimetroCirculo);

        input.close();
    }
}
