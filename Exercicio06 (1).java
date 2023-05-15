/*Descrição:
Autor: Tainá 
Data: 08/05/2023
*/

import java.util.Scanner;

public class Exercicio06{

     public static void main (String[] arg){
        Scanner insira = new Scanner (System.in);
        int kiwi, laranja, roma, resultado;
        kiwi = 0;
        laranja = 0;
        roma = 0;
        resultado = 0; 

        System.out.print("Digite quantos picolés de kiwi você deseja");
        kiwi = insira.nextInt();
        System.out.print("Digite quantos picolés de laranja você deseja");
        laranja = insira.nextInt();
         System.out.print("Digite quantos picolés de romã você deseja");
        roma = insira.nextInt();

        resultado = (kiwi*3.20)+(laranja*2.39)+(roma*7.0);

        System.out.print("o resultado é:" + resultado);
    
    
     }
}