import java.util.Stack;

/**
 * stacksNStuff
 */
public class stacksNStuff {

    public static void main(String[] args) {

        Stack<String> games = new Stack<String>(); // implementing stacks in java
        games.add("Call of Duty");
        games.add("Gutair Hero");
        games.add("Super Monkey Ball");

        System.out.println(games.pop()); // prints the last item on the stack

        System.out.println(games.peek()); // prints the top only
        System.out.println(games); // prints everything in a stack top down.

    }
}