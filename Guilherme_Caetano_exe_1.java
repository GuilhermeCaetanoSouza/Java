
/*Descrição: Algoritmo que recebe um valor e desconta 15% dele
 * Autor: Guilherme Caetano de Souza
 * Data: 17/05/2023
 */

 import java.util.Scanner;

public class Guilherme_Caetano_exe_1{
    public static void main(String[]args){
        Scanner exe1 = new Scanner(System.in);
//criando as variaveis
        double n, resul, resul2;
        n = 0.0;
        resul = 0.0;
        resul2 = 0.0;
//leitura da variavel n
        System.out.println(" Digite um valor: ");
        n= exe1.nextInt();
//calculos
        resul = (n/100)*85;
         
//exibição
        System.out.println("O valor original: " + n);
        System.out.println("O valor com desconto: " + resul);

        exe1.close();

    }

    
}
