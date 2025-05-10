import java.util.Arrays;

public class Exercicio6 {

    /*
    Exercício 6. Escreva um méthodo que recebe um array de inteiros a
    e devolve um array de boolean onde, cada posição indique true
    se o elemento da posição correspondente de a é positivo
    e false caso seja negativo ou zero.
     */

    public static void main(String[] args) {
        int[] array1 = {-5, 3, 8, -2, 0};
        int[] array2 = {7, -3, -6, 1, 12};
        int[] array3 = {-10, -20, 30, 40, -1};
        int[] array4 = {0, -7, 14, -8, 9};
        int[] array5 = {25, -13, 6, -4, 2};

        System.out.println(Arrays.toString(checkSignals(array1)));
        System.out.println(Arrays.toString(checkSignals(array2)));
        System.out.println(Arrays.toString(checkSignals(array3)));
        System.out.println(Arrays.toString(checkSignals(array4)));
        System.out.println(Arrays.toString(checkSignals(array5)));
    }

    public static boolean[] checkSignals(int[] a){
        boolean[] output = new boolean[a.length];
        for (int x = 0; x < a.length; x++){
            if(a[x] < 0){
                output[x] = false;
            }else {
                output[x] = true;
            }
        }
        return output;
    }

}
