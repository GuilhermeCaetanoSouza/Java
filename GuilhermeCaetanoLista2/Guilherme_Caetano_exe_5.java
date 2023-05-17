/*Descrição: Algoritmo que recebe 3 valor e determina o maior
 * Autor: Guilherme Caetano de Souza
 * Data: 17/05/2023
 */

 import java.util.Scanner;

public class Guilherme_Caetano_exe_5{
    public static void main(String[]args){
        Scanner exe5 = new Scanner(System.in);
//criando as variaveis
        double n1, n2, n3;
        n1 = 0.0;
        n2 = 0.0;
        n3 = 0.0;
//leitura das variaveis 
        System.out.println(" Digite o numero: ");
       n1= exe5.nextInt();
// atribuindo novos valores
n2= (n1-1);       
n3= (n1+1);        
       
//exibindo 
System.out.println("  o antecessor do numero digitado é: "+ n2);
System.out.println("  o  sucessor do numero digitado é: "+ n3);
}     
        

    }
