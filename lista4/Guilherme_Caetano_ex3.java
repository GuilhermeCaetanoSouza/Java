
/*Algoritmo que recebe tres números e enquanto a soma for diferente de 48 ou 71, continue recebendo os velores
 * Guilherme Caetano
 * 29/05/2023
 */

 import java.util.Random;

   public class Guilherme_Caetano_ex3 {
    public static void main(String[] args) {

        //inicialização das variaveis
        int a = 0;
        double b = 0.0;
        
        // geraando 50 numeros inteiros aleatórios e somando
        for (int i = 0; i < 50; i++) {
            int ni = NumeroInteiroAleatorio();
            si += ni;
        }
        
        // "for" para gerar 50 numeros reais aleatórios e somá-los
        for (int i = 0; i < 50; i++) {
            double nr = NumeroRealAleatorio();
            sr += nr;
        }
        
        // Condições
        if (si > sr) {
            System.out.println("A soma dos números inteiros é maior: " + si);
        } else if (si < sr) {
            System.out.println("A soma dos números reais é maior: " + sr);
        } else {
            System.out.println("As duas somas são iguais: " + si);
        }
    }
    
    // Gera um número inteiro aleatório entre 0 e 1000
    private static int NumeroInteiroAleatorio() {
        Random exe3 = new Random();
        return exe3.nextInt(1001);
    }
    
    // Gerando um número aleatório entre 0.0 e 1.0
    private static double NumeroRealAleatorio() {
        Random exe3 = new Random();
        return exe3.nextDouble();
    }
}

 