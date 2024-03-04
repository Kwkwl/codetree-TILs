import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());

        LinkedList<Integer> l = new LinkedList<>();

        for(int i=0;i<count;i++){
            String command = sc.nextLine();

            if(command.startsWith("push")){
                String[] temp = command.split(" ");
                int num = Integer.parseInt(temp[1]);

                if(temp[0].endsWith("front")){
                    l.addFirst(num); 
                }else {
                    l.addLast(num); 
                }
            } else if(command.startsWith("pop")){
                String[] temp = command.split("_");

                if(temp[1].equals("front")){
                    System.out.println(l.pollFirst());
                }else {
                    System.out.println(l.pollLast());
                }
            } else if(command.equals("size")){
                System.out.println(l.size());

            } else if(command.equals("front")){
                System.out.println(l.peekFirst());

            } else if(command.equals("back")){
                System.out.println(l.peekLast());

            } else {
                if(l.isEmpty()){
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } 
        }
        sc.close();
    }
}