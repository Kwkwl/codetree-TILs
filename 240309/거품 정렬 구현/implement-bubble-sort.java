import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] array = (br.readLine).split(" ");
        int[] arr = new int[n];

        for(int i=0;i<array.length;i++){
            arr[i] = Integer.parseInt(array[i]);
        }

        while(true){
            int idx = 0;
            boolean sorted = true;

            if(idx == arr.length-1){
                if(sorted){
                    break;
                } else {
                    idx = 0;
                }
            }

            if(arr[idx] > arr[idx+1]){
                int tmp = arr[idx];
                arr[idx] = arr[idx+1];
                arr[idx+1] = tmp;
            }
            idx++;

            for(int i=0;i<arr.length;i++){
                if(arr[idx] > arr[idx+1]){
                    sorted = false;
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}