package Desafios;

import java.util.ArrayList;
import java.util.List;

public class NumerosPrimosEntre {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        List<Integer> primos = encontrarNumerosPrimos(a,b);
        System.out.println("Os numeros primos no intervaldo de  [ " + a + ", " + b + " ] :" + primos );

    }
    public static List<Integer> encontrarNumerosPrimos(int a, int b) {
        List<Integer> numerosPrimos = new ArrayList<Integer>();
        for(int i = a; i <= b; i++) {
            if(ehPrimo(i)){
                numerosPrimos.add(i);
            }
        } return numerosPrimos;
    }

    public static boolean ehPrimo(int num){
        if(num <= 1) {
            return false;
        }
        for(int i = 2; i < Math.sqrt(num); i++){
            if(num % i == 0) {
                return false;
            }}
        return true;
    }
}
