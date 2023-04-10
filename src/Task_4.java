import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task_4 {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        // result [6,6,0,1]
        
        System.out.print(sum(d1, d2));

    }

    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> ll = new ArrayDeque<>();
        int d1Size = d1.size();
        int x = 0;
        for (int i = 0; i < d1Size; i++) {
            int x1 = d1.removeFirst();
            int x2 = d2.removeFirst();
            int summ = x1 + x2;
            if (summ >= 10){
                ll.add(summ % 10 + x++);
            }
            else{
                ll.add(summ + x);
                x = 0;
            }
        }
        ll.add(x);
        return ll;
    }
      
}
