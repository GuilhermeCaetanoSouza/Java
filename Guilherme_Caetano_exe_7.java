
/*
Algoritimo de tentar acertar o numero
 Autor: Guilherme Caetano de Souza
 * Data: 17/05/2023
 */

 import java.util.Scanner;

public class Guilherme_Caetano_exe_7{
    public static void main(String[]args){
        Scanner exe7 = new Scanner(System.in);
//criando as variaveis
        double n1;
        n1 = 0.0;
//leitura da variavel n
        System.out.println(" Digite o numero que você acredita ser o certo entre 0 e 30: ");
        n1= exe7.nextInt();
        
//determinando o valor certo e lendo a tentativa
if(n1 == 27){
System.out.println( "você acertou!!! ");
    }else{
        System.out.println( "você errou, era 27!!! ");

    }
        exe7.close();

}}   