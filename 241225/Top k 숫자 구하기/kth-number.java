import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();

        String[] nAndK = tmp.split(" ");

        int k = Integer.parseInt(nAndK[1]);

        String tmp2 = sc.nextLine();

        char[] numbersChar = tmp2.toCharArray();

        Arrays.sort(numbersChar);

        char[] numbersChar2 = Arrays.copyOf(numbersChar, numbersChar.length + 1);

        for(int i=1;i<numbersChar2.length;i++) {            
            numbersChar2[i] = numbersChar2[i-1];
        }

        for(int i=1;i<numbersChar2.length+1;i++) {
            if(i == k) {
                System.out.println(numbersChar[i]);
                break;
            }
        }
    }
}