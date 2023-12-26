/*15. Crie um programa que solicite ao usuário o valor do raio de uma esfera e calcule e exiba o seu volume. */

package Exercicios100.Exercicios11A20.Exercicio15;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int raioDaEsfera;
        double volumeDaEsfera;

        System.out.print("Digite o raio da esfera: ");
        raioDaEsfera = input.nextInt();

        volumeDaEsfera = (4 * Math.PI * Math.pow(raioDaEsfera, 3) / 3);

        System.out.printf("O volume da esfera é: %.0f", volumeDaEsfera);

        input.close();
    }
}
