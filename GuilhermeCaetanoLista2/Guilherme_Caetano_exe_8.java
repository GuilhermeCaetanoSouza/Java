/*  ALgoritimo para calcular bascara
 *  Autor: Guilherme Caetano de Souza
 * Data: 17/05/2023
 */

 import java.util.Scanner;

public class Guilherme_Caetano_exe_8{
    public static void main(String[]args){
        Scanner exe7 = new Scanner(System.in);
//criando as variaveis
        double n1, n2, n3,n4,n5,n6,n7;
        n1=n2=n3=n4=n5=n6=n7=  0.0;
//leitura da variavel n
        System.out.println(" Digite o valor de a: ");
        n1= exe7.nextInt();
        System.out.println(" Digite o valor de b: ");
        n2= exe7.nextInt();
        System.out.println(" Digite o valor de c: ");
        n3= exe7.nextInt();
//determinando o valor do delta
n4= ((n2*n2)-(4*(n1)*(n3)));

n6=((-(n2)+Math.sqrt(n4))/2*n1);
n7=((-(n2)- Math.sqrt(n4))/2*n1);
// exibindo delta
System.out.println(" o valor do seu delta é de: "+ n4);
if(n4<0){
    System.out.println(" como seu delta é negativo recomendamos que pare por aki seu calculo. ");   
}else{
System.out.println(" o valor do seu x1 é: "+ n6);
System.out.println(" o valor do seu x2 é: "+ n7);
System.out.println(" agradecemos por você usar nossa calculadora de baskara!❤ ");
}
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
  
