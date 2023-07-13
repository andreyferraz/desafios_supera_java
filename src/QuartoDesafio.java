import java.util.Scanner;

public class QuartoDesafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de casos de teste: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            String line = sc.nextLine();
            String phraseDecode = decodeDecoding(line);
            System.out.println(phraseDecode);
        }


        sc.close();
    }

    private static String decodeDecoding(String line) {
        int mid = line.length() / 2;
        StringBuilder sb = new StringBuilder();

        for(int i = mid - 1; i >= 0; i--){
            sb.append(line.charAt(i));
        }

        for(int i = line.length() - 1; i >= mid; i--){
            sb.append(line.charAt(i));
        }
        return sb.toString();
    }
}
