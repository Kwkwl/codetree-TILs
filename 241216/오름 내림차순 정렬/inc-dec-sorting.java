import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();

        String numbers = sc.nextLine();
        String[] tempArr = numbers.split(" ");
        int[] numbersArr = new int[tempArr.length];

        for(int i=0;i<tempArr.length;i++) {
            numbersArr[i] = Integer.parseInt(tempArr[i]);
        } 
        
        StringBuilder sb = new StringBuilder();

        // 오름차순 정렬 
        Arrays.sort(numbersArr);

        for(int i=0;i<numbersArr.length;i++) {
            sb.append(numbersArr[i]+" ");
        }

        System.out.println(sb.toString());

        sb = new StringBuilder();

        // 내림차순 정렬
        Integer[] numbersArr2 = Arrays.stream(numbersArr).boxed().toArray(Integer[]::new);
        Arrays.sort(numbersArr2, Collections.reverseOrder());

        for(int i=0;i<numbersArr2.length;i++) {
            sb.append(numbersArr2[i]+" ");
        }

        System.out.println(sb.toString());
    }
}