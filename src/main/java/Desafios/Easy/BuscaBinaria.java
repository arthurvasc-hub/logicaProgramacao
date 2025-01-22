package Desafios.Easy;

public class BuscaBinaria {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 10, 13, 15};
        int valorProcurado = 5;

        int resultado = buscaBinaria(array, valorProcurado);
        System.out.println("Valor encontrado no indice " + resultado);
    }
    public static int buscaBinaria(int[] array, int valor) {
        int left = 0;
        int right = array.length - 1;
        while(left <= right) {
            int middle = (left + right) / 2;
            if(array[middle] == valor) {
                return middle;
            }
            if(array[middle] < valor) {
                left = middle + 1;
            }
            else{
                right = middle - 1;
            }
        }
        return -1;
    }
}
