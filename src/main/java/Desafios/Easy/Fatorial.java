package Desafios.Easy;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero inteiro e positivo : ");
        long num = input.nextInt();

        if(num == 0 || num < 1) {
            System.out.println("Digite um numero inteiro e positivo");
        }

            int fatorial = 1;
            for(int i = 1; i <= num; i++) {
                fatorial *= i;
            }

            System.out.println("Fatorial do numero " + num + " = " + fatorial);
    }
}
