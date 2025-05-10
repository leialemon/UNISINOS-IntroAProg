public class Exercicio7 {

    /*
    Exercício 7. Escreva um méthodo que recebe um array de double
    e devolve a posição onde se encontra o maior valor do array.
    Se houver mais de um valor maior, devolver a posição da primeira ocorrência.
     */

    public static void main(String[] args) {
        double[] array1 = {2.5, -3.1, 4.0, 0.0, 7.2, -1.6};
        double[] array2 = {10.5, 8.8, -4.4, 3.3, -9.9, 1.1};
        double[] array3 = {-7.7, 6.6, 5.5, -2.2, 0.0, 4.4};

        System.out.println(findBiggest(array1));
        System.out.println(findBiggest(array2));
        System.out.println(findBiggest(array3));
    }

    public static int findBiggest(double[] input){
        int biggestIndex = 0;
        for (int x = 0; x < input.length; x++){
            if(input[x] > input[biggestIndex]){
                biggestIndex = x;
            }
        }
        return biggestIndex;
    }
}
