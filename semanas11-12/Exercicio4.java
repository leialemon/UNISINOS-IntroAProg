public class Exercicio4 {

    /*
    Exercício 4. Crie um méthodo que recebe um array de inteiros
    e retorna a quantidade de elementos do array que são números negativos.
     */

    public static void main(String[] args) {
        int[] array1 = {4, -3, 7, -1, 0};
        int[] array2 = {-10, -5, -3, -1, -7};
        int[] array3 = {12, 0, -8, 6, -4};
        int[] array4 = {3, 5, 9, 2, 1};
        int[] array5 = {-2, 4, -6, -9, 7};

        System.out.println(checkNegatives(array1));
        System.out.println(checkNegatives(array2));
        System.out.println(checkNegatives(array3));
        System.out.println(checkNegatives(array4));
        System.out.println(checkNegatives(array5));
    }

    public static int checkNegatives(int[] input){
        int negatives = 0;
        int x = 0;
        while(x < input.length){
            if(input[x] < 0){
                negatives++;
            }
            x++;
        }

        return negatives;
    }

}
