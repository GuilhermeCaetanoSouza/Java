/*
Guilherme Caetano de Souza
categorizando sua idade
*/ 
//iniciação do scanner
import java.util.Scanner;
public class licoes4{
   public static void main(String args[]){
      //continuação do scanner
       Scanner leitor= new Scanner (System.in);
      //adapitação das variaveis
       int n1;
       //clonando o scanner nas variaveis
       System.out.println("Me diga sua idade: ");
      n1= leitor.nextInt();
//dando condições
if (n1<=12){
System.out.println("você é uma criança");}
else if (n1> 12 && n1 <=19){
    System.out.println("você é um adolecente");
}
else if (n1 >19 && n1 <=65){
    System.out.println("você é um adulto");
}
else {
    System.out.println("você é uma idoso");
}
}
   }

