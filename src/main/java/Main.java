import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String aa = in.nextLine();
        String input = in.nextLine();
        StringBuilder strB = new StringBuilder(input);
        String[] arr = input.split("");
        int res = size;
        ArrayDeque<String> q = new ArrayDeque<>(size);
        q.add(arr[0]);
        String a;
        if ((strB.indexOf("a")==-1)|(strB.indexOf("b")==-1)|(strB.indexOf("c")==-1)|(strB.indexOf("d")==-1)){
            System.out.println(-1);
        }else{
            for (int i = 1; i<size; i++){
                if (q.getFirst().equals(arr[i])) q.removeFirst();
                q.add(arr[i]);

                for (int j = 0; j<q.size();j++) {
                    a = q.removeFirst();
                    if (!q.contains(a)) q.addFirst(a);
                }

                if (((q.contains("a"))&(q.contains("b"))&(q.contains("c"))&(q.contains("d")))&(res>q.size())){
                    res = q.size();
                }
            }
            System.out.println(res);
        }
    }
}
