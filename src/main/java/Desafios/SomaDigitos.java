package Desafios;

import java.util.Scanner;

public class SomaDigitos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = input.nextInt();
        int numeroOriginal = numero; // Para exibir no final


        int soma = 0;
        while (numero > 0) {
                int digito = numero % 10;
                soma += digito;
                numero = numero / 10;
        }
        System.out.println("A soma dos digitos do numero : " + numeroOriginal + " é: " + soma);
    }

}
