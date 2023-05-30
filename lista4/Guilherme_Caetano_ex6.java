/*Algoritmo que soma 10 numeros inteiros e exibe a raiz quadrada da soma 
Guilherme
29/05
 */


import java.util.Scanner;

//inicialização da class princinpal
public class Guilherme_Caetano_ex5 {
    public static void main(String[] args) {
        Scanner exe6 = new Scanner(System.in);

        //criação e inicialização das variaveis
        int contador = 0;
        int soma = 0;
        int valor = 0;
        double raiz = 0.0;

        //inicio do "while" para que o usuario insira os 10 numeros
        while (contador < 10) {
            System.out.print("Digite um valor inteiro positivo: ");
            valor = exe6.nextInt();
            
            //if para o algoritmo ignorar a entrada de numeros negativo 
            if (valor >= 0) {
                soma += valor;
                contador++;
            }
        }
        
        //calcula a raiz quadrada da soma
        raiz = Math.sqrt(soma);

        //mostra os resultados na tela dp usuario
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A raiz quadrada da soma é: " + raiz);

        exe6.close();
    }}