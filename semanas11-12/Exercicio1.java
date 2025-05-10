import java.util.Arrays;

public class Exercicio1 {

    /*
    Exercício 1. Para cada conjunto de valores abaixo,
    escreva o código Java, usando laço(s),
    que preencha um array com os valores:
    10   9   8   7   6   5   4   3   2   1
    0   1   4   9   16   25   36   49   64   81   100
    1   2   3   4   5   10   20   30   40   50
    3   4   7   12   19   28   39   52   67   84
    */

    public static void main(String[] args){
        System.out.println(Arrays.toString(methodA()));
        System.out.println(Arrays.toString(methodB()));
        System.out.println(Arrays.toString(methodC()));
        System.out.println(Arrays.toString(methodD()));
    }


    public static int[] methodA(){
        int[] output = new int[10];
        for(int x = 10; x > 0; x--){
            output[(10 - x)] = x;
        }
        return output;
    }

    public static int[] methodB(){
        int[] output = new int[11];
        for(int x = 0; x < 11; x++){
            output[x] = x*x;
        }
        return output;
    }

    public static int[] methodC(){
        int[] output = new int[10];
        for(int x = 1; x < 6; x++){
            output[(x-1)] = x;
            output[(x+4)] = x * 10;
        }
        return output;
    }

    public static int[] methodD(){
        int[] output = new int[10];
        int x = 3;
        int z = 1;
        output[0] = x;
        for(int y = 1; y < 18; y++){
            if(y % 2 != 0){
                x = x + y;
                output[z] = x;
                z++;
            }
        }
        return output;
    }
}
