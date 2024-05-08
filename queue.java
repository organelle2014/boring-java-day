import java.util.LinkedList;
import java.util.Queue;

public class queue {

    public static void main(String[] args) {

        Queue<String> bbqLine = new LinkedList<String>();

        bbqLine.add("Jackson");
        bbqLine.add("Tariq");
        bbqLine.add("Susan");

        bbqLine.poll(); // eliminates every first entry
        bbqLine.poll();

        System.out.println(bbqLine);
    }
}
