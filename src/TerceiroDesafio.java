import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TerceiroDesafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int n = sc.nextInt();
        System.out.print("Digite os valores do array: ");
        int k = sc.nextInt();

        int[] ar = new int[n];
        for(int i = 0; i<n; i++){
            ar[i] = sc.nextInt();
        }

        int count = countPairs(ar, k);
        System.out.println(count);

        sc.close();
    }

    private static int countPairs(int[] ar, int k) {
        int count = 0; 
        //mapa armazendo frequencia dos elementos do array
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int number : ar){
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }
        //verificando os pares
        for(int number : ar){
            int complement = number - k;
            if(frequencyMap.containsKey(complement)){
                count += frequencyMap.get(complement);
            }
        }
        return count;
    }
}
