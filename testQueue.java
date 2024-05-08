import java.util.LinkedList;
import java.util.Queue;

public class testQueue {
    public static void main(String[] args) {
        Queue<String> studentQueue = new LinkedList<String>();

        studentQueue.add("Richard");
        studentQueue.add("June");
        studentQueue.add("Judy");
        studentQueue.add("Putin");

        System.err.println(studentQueue.size());// check size

        do {
            String student = studentQueue.poll();
            System.out.println(student);
        } while (!studentQueue.isEmpty());

        System.err.println(studentQueue);
    }
}
