/*Descrição: Algoritmo para calcular a area do triangulo
 * Autor: Guilherme Caetano de Souza
 * Data: 17/05/2023
 */

 import java.util.Scanner;

public class Guilherme_Caetano_exe_3{
    public static void main(String[]args){
        Scanner exe3 = new Scanner(System.in);
//criando as variaveis
        double altura, base, area;
        altura = 0.0;
       base = 0.0;
      area = 0.0;
//leitura da medidas do triangulo
        System.out.println(" Digite a altura do triangulo: ");
        altura= exe3.nextInt();
        System.out.println(" Digite a base do triangulo: ");
        base= exe3.nextInt();
       
      //calculo
      area = ((base*altura)/2);   
//exibição
        System.out.println("a area do triangulo é: " + area);
        
        exe3.close();

    }

    
}
