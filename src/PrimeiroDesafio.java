import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PrimeiroDesafio {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas: ");
        int n = sc.nextInt();
        List<Integer> values = new ArrayList<>();
        System.out.println("Digite as entradas:");
        for(int i=0; i<n; i++){
            int value = sc.nextInt();
            values.add(value);
        }

        Collections.sort(values, new Comparator<Integer>() {
            public int compare(Integer a, Integer b){
                if(a % 2 == 0 && b % 2 == 0){
                    return a.compareTo(b);
                }else if(a % 2 != 0 && b % 2 != 0){
                    return b.compareTo(a);
                }else if(a % 2 == 0){
                    return -1;
                }else{
                    return 1;
                }
            }
        });
        System.out.println("A saída deve ficar assim:");
        for(int value : values){ 
            System.out.println(value);
        }
        sc.close();
    }
}
