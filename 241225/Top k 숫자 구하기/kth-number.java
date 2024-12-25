import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();

        String[] nAndK = tmp.split(" ");

        int n = Integer.parseInt(nAndK[0]);
        int k = Integer.parseInt(nAndK[1]);

        String tmp2 = sc.nextLine();

        char[] numbersChar = tmp2.toCharArray();

        Arrays.sort(numbersChar);

        for(int i=0;i<numbersChar.length;i++) {
            if(i == k) {
                System.out.println(numbersChar[i]);
                break;
            }
        }
    }
}