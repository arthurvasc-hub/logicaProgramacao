package Desafios;

public class SomaNumerosPares {
    public static void main(String[] args) {
        /*
        * 1. Soma dos Números Pares de uma Lista
Descrição:
Escreva uma função que recebe uma lista de números inteiros e retorna a soma de todos os números pares da lista.

Exemplo:
Entrada: [1, 2, 3, 4, 5, 6]
Saída: 12
* */
        int[] numeros = {1,2,3,4,5,6, 8};
        int resultado = somaPares(numeros);
        System.out.println("A soma dos numeros pares é: " + resultado);

    }

    public static int somaPares(int[] numeros) {
        int soma = 0;
        for(int numero : numeros) {
            if(numero % 2 == 0) {
                soma += numero;
            }
        } return soma;
    }
}
