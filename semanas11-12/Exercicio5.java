public class Exercicio5 {

    /*
    Exercício 5. Crie um méthodo que recebe um array de inteiros a
    e um valor inteiro x e retorna a quantidade de vezes que x aparece no array a.
     */

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 2, 4, 2};
        int[] array2 = {-1, -2, -3, -1, -1};
        int[] array3 = {0, 0, 0, 0};
        int[] array4 = {5, 6, 7, 8};
        int[] array5 = {10, 20, 30, 10, 20, 10};

        System.out.println(countXTimes(array1, 2));
        System.out.println(countXTimes(array2, -1));
        System.out.println(countXTimes(array3, 0));
        System.out.println(countXTimes(array4, 9));
        System.out.println(countXTimes(array5, 10));
    }

    public static int countXTimes(int[] inputArray, int xValue){
        int timesX = 0;
        for(int x = 0; x < inputArray.length; x++){
            if(inputArray[x] == xValue){
                timesX++;
            }
        }
        return timesX;
    }
}
