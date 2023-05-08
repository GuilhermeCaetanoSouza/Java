/*
Guilherme Caetano de Souza
testando alguns codigos
*/ 
//iniciação do scanner
 import java.util.Scanner;
 public class licoes2{
    public static void main(String args[]){
       //continuação do scanner
        Scanner leitor= new Scanner (System.in);
       //adapitação das variaveis
        double n1, n2, n3, n4, media;
        media = n1 = n2 = n3 = n4 =0;
        //clonando o scanner nas variaveis
        System.out.println("Me diga o primeiro numero: ");
       n1= leitor.nextDouble();
       System.out.println("Me diga o segunda numero: ");
        n2= leitor.nextDouble();
        System.out.println("Me diga o terceira numero: ");
         n3= leitor.nextDouble();
         System.out.println("Me diga o ultima numero: ");
          n4= leitor.nextDouble();
//dando condições
media = (n1*n1)+(n2*n2)+(n3*n3)+(n4*n4)/4;
System.out.println("A soma desses numeros ao quadrado é: "+ media);
    }
}
