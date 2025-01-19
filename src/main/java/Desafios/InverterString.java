package Desafios;

public class InverterString {
    public static void main(String[] args) {
        String palavra = "monkey";
        String invertida = inverterString(palavra);

        System.out.println("Palavra normal: " + palavra);
        System.out.println("Palavra invertida: " +invertida);
    }
    public static String inverterString(String palavra) {
        String resultado = "";
        for(int i = palavra.length() - 1; i >= 0; i--){
            resultado += palavra.charAt(i);
        }
        return resultado;
    }
}
