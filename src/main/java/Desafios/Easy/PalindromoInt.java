package Desafios.Easy;
/*
* Escreva uma função para verificar se um número inteiro é um palindromo.
* */
public class PalindromoInt {
    public static void main(String[] args) {
        int numero = 121;
        boolean resultado = isPalindrome(numero);
        System.out.println(resultado);
    }

    public static boolean isPalindrome(int x) {
        // Converte o número em uma string
        String converter = Integer.toString(x);
        int inicio = 0;
        int fim = converter.length() - 1;

        // Verifica se os caracteres nas extremidades são iguais
        while (inicio < fim) {
            if (converter.charAt(inicio) != converter.charAt(fim)) {
                return false; // Não é um palíndromo
            }
            inicio++;
            fim--;
        }
        return true; // É um palíndromo
    }
}
