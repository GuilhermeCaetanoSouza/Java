/*
 * leia dois valores int e mostre os numeros entre eles
 * Guilherme Cartano de Souza
 * 16/05/23
 */
import java.util.Scanner;
public class AnnaMaffei_exer2 {
    public static void main(String [] args){
        Scanner v = new Scanner(System.in);
            System.out.println("Digite o primeiro valor: ");
            int valor1 = v.nextInt();
            System.out.println("Digite o segundo valor: ");
            int valor2 = v.nextInt();
        for (int cont=valor1; cont<valor2; cont++){
            System.out.println(cont);
        }
        v.close();
    }
    
}
