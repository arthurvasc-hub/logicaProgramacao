package Desafios;

import java.util.Scanner;

public class MaiorNumeroArray {
    public static void main(String[] args) {
        /*
        * 3. Encontrar o Maior Número em um Array

Descrição:
Dado um array de números inteiros, retorne o maior número.

Exemplo:
Entrada: [3, 7, 2, 8, 5]
Saída: 8
* */
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho da array: " );
        int tamanho = input.nextInt();

        int[] numeros = new int[tamanho];

        System.out.println("Digite os valores da array: ");
        for(int i =0; i < tamanho; i++){
            numeros[i] = input.nextInt();
        }

        int maior = numeroMaior(numeros);


        System.out.println("O maior numero do array é: " + maior);
        input.close();
    }

    public static int numeroMaior(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("O array não pode estar vazio.");
        }

        int maior = numeros[0];
        for(int i = 1; i < numeros.length; i++) {
            if(numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }
}
