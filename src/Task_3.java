import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;


public class Task_3 {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));
        checkOn(deque);
        
    }
    public static boolean checkOn(Deque<Integer> deque){
        Boolean flag = true;
        int first = deque.pollFirst();
        int last = deque.pollLast();
        for (int i = 0; i < deque.size() / 2; i++) {
            
            if (first != last){
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.print("Палиндром");
        else
            System.out.print("Не палиндром");
        return false;
                     
    }
    
}

