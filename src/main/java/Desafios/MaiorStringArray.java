package Desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaiorStringArray {
    public static void main(String[] args) {
        /*
        * 4. Ordenação de Strings por Tamanho

Descrição:
Escreva uma função que ordena uma lista de strings pelo comprimento de cada string (ordem crescente).

Exemplo:
Entrada: ["casa", "sol", "elefante", "ar"]
Saída: ["ar", "sol", "casa", "elefante"]
        * */

      /*  List<String> palavras = Arrays.asList("gatoo", "elefante", "pat", "leão");
        palavras.sort(Comparator.comparingInt(String::length));

        System.out.println("Palavras ordenadas por tamanho: " + palavras);

        Agora utilizando o metodo Bubble Sort ->
        */

        String[] palavras = {"macaco", "elefante", "pa", "leao"};

            for(int i = 0; i < palavras.length - 1; i++){
                for(int j = 0; j < palavras.length - i - 1; j++){
                    if(palavras[j].length() > palavras[j + 1].length()){
                        String temp = palavras[j];
                        palavras[j] = palavras[j + 1];
                        palavras[j + 1] = temp;
                    }
                }
            }
        System.out.println("Lista ordenada : " + Arrays.toString(palavras));


    }


    }

