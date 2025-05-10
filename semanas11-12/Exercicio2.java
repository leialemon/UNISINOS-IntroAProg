public class Exercicio2 {

    /*
    Exercício 2. Escreva um trecho Java
    que exiba os valores de um array a double numa mesma linha.
     */

    public static void main(String[] args) {
        showArrayValuesInline();
    }

    public static void showArrayValuesInline(){
        double[] a = {1d, 2.5d, 3d, 4.5d, 5d};
        for (double x : a){
            System.out.print(x);
            System.out.print(" ");
        }
    }
}
