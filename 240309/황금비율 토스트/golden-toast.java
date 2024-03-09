import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = (br.readLine()).split(" ");
        String str = br.readLine();

        // 식빵 개수
        int n = Integer.parseInt(temp[0]);
        // 암호문 개수
        int m = Integer.parseInt(temp[1]);

        LinkedList<Character> l = new LinkedList<>();
        for(int i=0;i<n;i++){
            l.add(str.charAt(i));
        }

        ListIterator<Character> it = l.listIterator(l.size());

        for(int i=0;i<m;i++){
            String code = br.readLine();

            if(code.equals("L")){
                if(it.hasPrevious()){
                    it.previous();
                }
            } else if(code.equals("R")){
                if(it.hasNext()){
                    it.next();
                }
            } else if(code.equals("D")) {
                if(it.hasNext()){
                    it.next();
                    it.remove();
                }
            } else {
                String s = code.split(" ")[1];
                int idx = it.nextIndex();
                l.add(idx, s.charAt(0));
                it = l.listIterator(idx);

                if(it.hasNext()){
                    it.next();
                }
            }
        }
        while(it.hasPrevious()){
            it.previous();
        }

        StringBuffer sb = new StringBuffer();
        while(it.hasNext()){
            sb.append(it.next());
        }

        System.out.println(sb);
        br.close();
    }
}