package Desafios;

public class ContarOcorrencia {
    public static void main(String[] args) {
        String[] entrada = {"banana", "maçã", "uva", "banana", "banana"};
        String palavra = "banana";

        int resultado = contagemPalavrasIguais(entrada, palavra);
        System.out.println("O numero de vezes que a palavra " + palavra + " apareceu na array, foram " + resultado + " vezes.");
    }

    public static int contagemPalavrasIguais(String[] entrada, String palavra) {
        int resultado = 0;
        if (entrada == null || entrada.length == 0) {
            return 0;
        }
        for (int i = 0; i < entrada.length; i++) {
            if (entrada[i].equalsIgnoreCase(palavra)) {
                resultado++;
            }
        } return resultado;
    }

}
