/*
Guilherme Caetano de Souza
converção em de dolar
*/ 
//iniciação do scanner
import java.util.Scanner;
public class licoes3 {
   public static void main(String args[]){
      //continuação do scanner
       Scanner leitor= new Scanner (System.in);
      //adapitação das variaveis
       double n1,n2;
       n1 =n2 =0;
      
       //clonando o scanner nas variaveis
       System.out.println("Me diga o valor que quer converter de dolar para R$ : ");
      n1= leitor.nextDouble();
      n2 = n1*4.95;
      System.out.println("A converção desse valor é: R$"+ n2);
   }
}
