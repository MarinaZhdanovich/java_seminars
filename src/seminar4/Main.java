package seminar4;

public class Main {
    public static void main(String[] args) {
        GBStack gbStack = new GBStack();
        System.out.println(gbStack.empty());
        gbStack.push(1)
                .push(5)
                .push(3)
                .push(10);
        System.out.println(gbStack);
        System.out.println(gbStack.peek());
        System.out.println(gbStack.pop());
        System.out.println(gbStack.pop());
        System.out.println(gbStack.size());
        System.out.println(gbStack.empty());
    }
}
