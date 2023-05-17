/*Descrição: Algoritmo que recebe 3 valor e determina o maior
 * Autor: Guilherme Caetano de Souza
 * Data: 17/05/2023
 */

 import java.util.Scanner;

public class Guilherme_Caetano_exe_4{
    public static void main(String[]args){
        Scanner exe4 = new Scanner(System.in);
//criando as variaveis
        double n1, n2, n3, n4;
        n1 = 0.0;
        n2 = 0.0;
        n3 = 0.0;
        n4 = 0.0;
//leitura das variaveis n e atribuição dos valor
        System.out.println(" Digite o primeiro numero: ");
       n2= n1= exe4.nextInt();
        System.out.println(" Digite o segundo numero: ");
        n3= n4= exe4.nextInt();
        n1=n3;
        n4= n2;
        
       
//exibindo a troca
System.out.println("  o primeiro numero digitado foi: "+ n1);
System.out.println( " e o segundo foi: "+ n4);
}     
        

    }

    
