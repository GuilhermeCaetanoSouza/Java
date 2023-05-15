/*Descrição: Monte um algoritmo que calcule o perímetro de um círculo, onde o valor do raio será inserido
pelo usuário. (Perímetro = 2π * r)
 * Autor: Guilherme Caetano de souza
 * Data: 15/05/23
 */

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner insira = new Scanner(System.in);

        double raio, perimetro; // dando as variaveis

        raio = 0; // valores as variaveis
        perimetro = 0;

        System.out.print("Digite o valor do raio: ");
        raio = insira.nextDouble(); 

        perimetro = 2 * 3.14 * raio; // calculo e mostra do perimetro 
        System.out.print("O perimetro do circulo: " + perimetro);

        insira.close();
    }
}
