/*
Guilherme Caetano de Souza
testando alguns codigos
*/ 
//iniciação do scanner
 import java.util.Scanner;
 public class licoes1 {
    public static void main(String args[]){
       //continuação do scanner
        Scanner leitor= new Scanner (System.in);
       //adapitação das variaveis
        double n1, n2, n3, n4, media;
        media = n1 = n2 = n3 = n4 =0;
        //clonando o scanner nas variaveis
        System.out.println("Me diga sua primeira nota: ");
       n1= leitor.nextDouble();
       System.out.println("Me diga sua segunda nota: ");
        n2= leitor.nextDouble();
        System.out.println("Me diga sua terceira nota: ");
         n3= leitor.nextDouble();
         System.out.println("Me diga sua ultima nota: ");
          n4= leitor.nextDouble();
//dando condições
media = (n1+n2+n3+n4)/4;
if(media>=7){
System.out.println("a sua media é: "+ media );
System.out.println("parabens você foi aprovado" );}
else{ 
System.out.println("a sua media é: "+ media );
System.out.println("você foi reprovado ");}
    }
 }
