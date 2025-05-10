import java.util.Arrays;
import java.util.Scanner;

public class Exercicio3 {

    /*
    Exercício 3. Escreva um trecho Java que leia 10 valores
    double do teclado e armazene-os num array d.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] d = new double[10];
        for(int x = 0; x < 10; x ++){
            System.out.println("Digite um número decimal:");
            d[x] = input.nextDouble();
        }

        input.close();
        System.out.println(Arrays.toString(d));
    }
}
