/*Descrição: Algoritmo para atribuir o valor da compa de picolés
 * Autor: Guilherme Caetano de Souza
 * Data: 17/05/2023
 */

 import java.util.Scanner;

public class Guilherme_Caetano_exe_6{
    public static void main(String[]args){
        Scanner exe6 = new Scanner(System.in);
//criando as variaveis
        double k, l, r, compra;
        k = 0.0;
        l = 0.0;
        r = 0.0;
        compra = 0.0;
//leitura das variaveis
        System.out.println(" quantos picoles de kiwi foram comprados? ");
       k= exe6.nextInt();
       System.out.println(" quantos picoles de laranja foram comprados? ");
       l= exe6.nextInt();
       System.out.println(" quantos picoles de romã foram comprados? ");
       r= exe6.nextInt();
        
 //calculo da compra  
compra=((k*3.20)+(l*2.39)+(r*7.99));
//exibindo a compra
System.out.println("  o valor da compra foi: "+ compra);
}     
        

    }