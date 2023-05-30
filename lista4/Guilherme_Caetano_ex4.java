/*Algoritmo para classificar uma palavra 
Guilherme
29/05
 */

import java.util.Scanner;

//inicialização da class
public class Guilherme_Caetano_ex4 {
    public static void main(String[] args) {
        Scanner exe4 = new Scanner(System.in);
        
        //criando as variaveis
        System.out.print("Digite um texto: ");
        String texto = exe4.nextLine(); 
        //nextLine() é utilizado para ler uma linha de texto digitada pelo usuário e armazená-la na variável texto
        
        //caracterização
        if (texto.length() > 10) { //length() utilizada para verificar o tamanho do texto
            System.out.println("Você digitou um palavrão!");
        } else {
            System.out.println("Você digitou uma palavrinha.");
        }

        exe4.close();
    }
}