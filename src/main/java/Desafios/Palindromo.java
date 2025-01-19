package Desafios;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        /*
        * 2. Verificar Palíndromo

Descrição:
Crie uma função que verifica se uma string fornecida é um palíndromo (lê-se da mesma forma de frente para trás).

Exemplo:
Entrada: "radar"
Saída: true
Entrada: "java"
Saída: false
        * */

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um palindromo: ");
        String palavra = input.nextLine();

        boolean resultado = ehPalindromo(palavra);

        System.out.println("A palavra digitada é um paldindromo ? : " + resultado);

        input.close();
    }

    public static boolean ehPalindromo(String palavra) {
        boolean resultado = true;
        int inicio = 0;
        int fim = palavra.length() - 1;

        while(inicio < fim){
            if(palavra.charAt(inicio) != palavra.charAt(fim)){
                resultado = false;
                break;
            }
            inicio++;
            fim--;

        }
        return resultado;
    }
}
