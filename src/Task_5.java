import java.util.Stack;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку, содержащую только символы '(', ')', '{', '}', '[' и ']'");
        String string = scanner.nextLine();
        if (validate(string)){
            System.out.println("Строка логически правильная.");
        }
        else{
            System.out.println("Строка логически неправильная.");
        }
        
    }
    
    public static boolean validate(String string){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            if (symbol == '(' || symbol == '[' || symbol == '{') {
                stack.push(symbol);
            } else if (symbol == ')' || symbol == ']' || symbol == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char last = stack.peek();
                if ((symbol == ')' && last == '(') || (symbol == ']' && last == '[') || (symbol == '}' && last == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
        
    }
}