import java.util.Stack;

class Madina {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push("Aishwarya");
        s.push("Akshay");
        s.push(10.12);
        s.push(40);

        // System.out.println(s);//[Aishwarya Akshay 10.12 40]
        // System.out.println(s.pop());

        // System.out.println(s);
        // System.out.println(s.pop());//40 [10.12 Akshay Aishwarya]
        // System.out.println(s);

        // System.out.println(s.peek());//40
        // System.out.println(s);
        // System.out.println(s.search("Aishwarya"));// 4
        // System.out.println(s.empty());//false

    }
}