/*Descrição: Algoritmo que caracteriza 2 numeros
 * Autor: Guilherme Caetano de Souza
 * Data: 17/05/2023
 */

 import java.util.Scanner;

public class Guilherme_Caetano_exe_9{
    public static void main(String[]args){
        Scanner exe2 = new Scanner(System.in);
//criando as variaveis
        double n1, n2;
        n1 = 0.0;
        n2 = 0.0;
//leitura das variaveis n
        System.out.println(" Digite o primeiro numero: ");
        n1= exe2.nextInt();
        System.out.println(" Digite o segundo numero: ");
        n2= exe2.nextInt();
//determinando 
if(n1 == n2){
System.out.println( " são iguais: ");
}else if(n2 > n1 ){
System.out.println(n2 + " é o maior numero: ");
}else{
System.out.println(n1 + " é o maior numero: ");
}     
        exe2.close();

    }

    
}
