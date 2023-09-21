/*Algoritimo que some todos os números cujo quadrado (x²) for divisível por 4.
Guilherme caetano de souza
29/05
*/

public class Guilherme_Exercicio01{

public static void main(String[] args){

 int lqd = 10; //limite para a soma dos quadrados

 double soma = 0; //variavel para somar




 for(int cont = 1; cont <= lqd; cont++ ){
//encontrando o quadrado dos valores
double quadrado = Math.pow(cont, 2); 
// se o resto de divisão por 4 for igual a 0
if(quadrado % 4 == 0){ 
     // some o valor da soma com o valor do quadrado
soma = soma + Math.pow(cont, 2); 

System.out.println("o quadrado do valor é: " + quadrado);

System.out.println("A soma é:" + soma);

 }else{
 }

 }
}
}





