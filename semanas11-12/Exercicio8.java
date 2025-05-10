import java.util.Arrays;
import java.util.Scanner;

public class Exercicio8 {

    /*
    Exercício 8. Faça um méthodo que devolve um array de números inteiros lidos do teclado.
    O tamanho do array também deve ser solicitado pelo teclado ao usuário.
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(createUserArray()));
    }

    public static int[] createUserArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho da array desejada:");
        int arraySize = input.nextInt();
        int[] output = new int[arraySize];
        int x = 0;
        while(x < arraySize){
            System.out.println("Digite o próximo número do Array:");
            output[x] = input.nextInt();
            x++;
        }
        return output;
    }
}
