import java.util.Stack;

public class Stack {
    public static void main(String[] args) {
        Stack<Object> s = new Stack<>();

        s.push("Aishwarya");
        s.push("Akshay");
        s.push(10.12);
        s.push(40);

        System.out.println(s);

    }
}