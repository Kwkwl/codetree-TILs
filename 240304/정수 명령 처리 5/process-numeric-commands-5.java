import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        
        ArrayList<Integer> list = new ArrayList();
        int count = Integer.parseInt(temp);

        for(int i=0;i<count;i++){
            String command = sc.nextLine();

             if(command.startsWith("push")) {
                String[] array = command.split(" ");
                int num = Integer.parseInt(array[1]);
                list.add(num);

            } else if (command.startsWith("pop")){
                list.remove(list.size()-1);

            } else if (command.startsWith("size")){
                System.out.println(list.size());

            } else {
                String[] array = command.split(" ");
                int num = Integer.parseInt(array[1]);
                System.out.println(list.get(num-1));
            }
        }
        sc.close();
    }
}