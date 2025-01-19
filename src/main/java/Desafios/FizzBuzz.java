package Desafios;

public class FizzBuzz {
    public static void main(String[] args) {
        /*
        * 5. FizzBuzz

Descrição:
Imprima os números de 1 a 100. Para múltiplos de 3, imprima "Fizz" ao invés do número.
* Para múltiplos de 5, imprima "Buzz". P
* ara múltiplos de ambos (3 e 5), imprima"FizzBuzz".
        * */

        int maior = 100;

        for(int i = 1; i <= maior; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
