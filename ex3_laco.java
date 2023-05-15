/*descrição:Algoritimo para a media de 500 numeros
Autor: Guilherme
Data: 15/05*/

import java.util.Scanner;

 public class ex3_laco {
 
public static void main(String[]args){
    
    Scanner reader= new Scanner (System.in);
    // cria e inicializa variaveis
    int valor;
    double somadora, media;
      valor = 0;
      media = somadora = 0.0;

    //pega os N
    while(valor < 5){

        System.out.println("digite um numero: ");
     
     somadora += reader.nextDouble();
        valor++;
        
    }
   media = somadora / valor;
   System.out.println("as somas: "+somadora);
   System.out.println("as media é: "+media);

}
}