package Desafios.Easy;

import java.util.Arrays;

public class TwoSum {
        /*
        * Dada uma matriz de números inteiros e um alvo inteiro,
        * retorne os indices dos dois números de forma que eles somem ao alvo
        *
        * Exemplo:
        * Input: nums = [2,7,11,15], target = 4;
        * Output: [0,1]
        * Explanation: because nums[0] + nums[1] == 9, we return [0,1].
        *
        *  */
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] resultado = twoSum(nums, target);
        System.out.println(resultado);

        if (resultado != null) {
            System.out.println(Arrays.toString(resultado));
        } else {
            System.out.println("Nenhuma combinação encontrada.");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        } return null;
    }
}
