/*Descrição: Algoritmo que recebe 3 valor e determina o maior
 * Autor: Guilherme Caetano de Souza
 * Data: 17/05/2023
 */

 import java.util.Scanner;

public class Guilherme_Caetano_exe_2{
    public static void main(String[]args){
        Scanner exe2 = new Scanner(System.in);
//criando as variaveis
        double n1, n2, n3;
        n1 = 0.0;
        n2 = 0.0;
        n3 = 0.0;
//leitura das variaveis n
        System.out.println(" Digite o primeiro numero: ");
        n1= exe2.nextInt();
        System.out.println(" Digite o segundo numero: ");
        n2= exe2.nextInt();
        System.out.println(" Digite o terceiro numero: ");
        n3= exe2.nextInt();
//determinando o maior
if(n1 > n2 && n1> n3){
System.out.println(n1 + " é o maior numero: ");
}else if(n2 > n1 && n2> n3){
System.out.println(n2 + " é o maior numero: ");
}else{
System.out.println(n3 + " é o maior numero: ");
}     
        exe2.close();

    }

    
}
