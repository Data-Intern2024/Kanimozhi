import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
            Queue <Integer> que = new LinkedList<>();
            que.add(4);
            que.add(23);
            que.add(7);
            que.add(43);
            que.add(90);

            System.out.println(que.remove());
            System.out.println(que.remove());
            System.out.println(que.remove());
            System.out.println(que.remove());
            System.out.println(que.remove());

    }
    
}
