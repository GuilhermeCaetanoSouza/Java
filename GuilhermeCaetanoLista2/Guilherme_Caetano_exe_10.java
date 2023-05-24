/*Descrição: Algoritmo que determina impares e pares
 * Autor: Guilherme Caetano de Souza
 * Data: 17/05/2023
 */

 import java.util.Scanner;

public class Guilherme_Caetano_exe_10{
    public static void main(String[]args){
        Scanner exe2 = new Scanner(System.in);
//criando as variaveis
       int n1;
        n1 = 0;
       
//leitura das variaveis n
        System.out.println(" Digite o numero que você quer saber ser impar ou par: ");
        n1= exe2.nextInt();
//determinando 
if(n1 % 2  == 0){
System.out.println( " seu numero é par ");
}else
System.out.println( "seu numero é impar ");
} 
       

    }

    

