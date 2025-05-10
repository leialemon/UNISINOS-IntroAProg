import java.util.Arrays;

public class Exercicio9 {

    /*
     Exercício 9. Crie um méthodo que recebe um array de inteiros positivos
     e substitui seus elementos de valor ímpar por -1 e os pares por +1.
     */

    public static void main(String[] args) {
        int[] array1= {3, 7, 15, 22, 9};
        int[] array2 = {12, 5, 8, 19, 27};
        int[] array3 = {4, 14, 6, 10, 18};
        int[] array4 = {1, 2, 3, 4, 5};
        int[] array5 = {30, 25, 40, 35, 20};

        System.out.println(Arrays.toString(oneificator(array1)));
        System.out.println(Arrays.toString(oneificator(array2)));
        System.out.println(Arrays.toString(oneificator(array3)));
        System.out.println(Arrays.toString(oneificator(array4)));
        System.out.println(Arrays.toString(oneificator(array5)));
    }

    public static int[] oneificator(int[] input){
        for (int x = 0; x < input.length; x++){
            if (input[x] % 2 == 0){
                input[x] = 1;
            } else {
                input[x] = -1;
            }
        }
        return input;
    }
}
