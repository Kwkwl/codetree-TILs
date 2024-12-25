import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        sc.nextLine();

        String[] words = new String[n];

        for(int i=0;i<words.length;i++) {
            words[i] = sc.nextLine();
        }

        Arrays.sort(words);

        for(int i=0;i<words.length;i++) {
            System.out.println(words[i]);
        }
    }
}