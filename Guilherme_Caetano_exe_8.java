/*  ALgoritimo para calcular bascara
 *  Autor: Guilherme Caetano de Souza
 * Data: 17/05/2023
 */

 import java.util.Scanner;

public class Guilherme_Caetano_exe_8{
    public static void main(String[]args){
        Scanner exe7 = new Scanner(System.in);
//criando as variaveis
        double n1, n2, n3,n4,n5;
        n1=n2=n3 = 0.0;
//leitura da variavel n
        System.out.println(" Digite o valor de a: ");
        n1= exe7.nextInt();
        System.out.println(" Digite o valor de b: ");
        n2= exe7.nextInt();
        System.out.println(" Digite o valor de c: ");
        n3= exe7.nextInt();
//determinando o valor do delta
n4= ((n2*n2)-(4*(n1)*(n3)));
// exibindo delta
System.out.println(" o valor do seu delta é de: "+ n4);
//atribuiçao de uma brincadeira
System.out.println(" continue no algoritimo mas tente acertar um numero agora ");
System.out.println("  Digite o numero que você acredita ser o certo entre 0 e 30: ");
//lendo a variavel
n5= exe7.nextInt();
//dando condições e exibindo
if(n1 == 27){
    System.out.println( "você acertou!!! ");
        }else{
            System.out.println( "você errou, era 27 adeus!!! ");
        exe7.close();

}} }
  
