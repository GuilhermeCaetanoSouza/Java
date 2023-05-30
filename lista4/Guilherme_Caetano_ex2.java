/*Algoritmo que recebe tres números e enquanto a soma for diferente de 48 ou 71, continue recebendo os velores
 * Guilherme Caetano
 * 29/05/2023
 */

import java.util.Scanner;

//inicialização da classGuilherme_Caetano_ex2
public class  {
    public static void main(String[] args) {
        Scanner ex2 = new Scanner(System.in);
        
        //inicialização do "while" jumto as variaveis
        while (true) {
            System.out.println("Digite três números: ");
            int n1 = ex2.nextInt();
            int n2 = ex2.nextInt();
            int n3 = ex2.nextInt();
            
            //calcular 
            int soma = n1 + n2 + n3;
            
            //condições
            if (soma == 48 || soma == 71) {
                System.out.println("Soma igual a 48 ou 71. Saída do programa.");
            }
            ex2.close(); 
        }
    }
}