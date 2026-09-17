import java.util.PriorityQueue;
import java.util.Queue;


/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        //create a priority q of strings
        //priorty q must be composed of items that implement that comparable intreface

        Queue<String> students = new PriorityQueue<>();
        students.add("Shiva");
        students.add("Claire");
        students.add("Ludovic");
        students.add("Manny");
        students.add("Ethan");
        students.add("Davin");
        //when you're adding things, it might not add them to the end of hte queue, but also not necessarily where they should be
        //but once you start removing things, then it just works
        //KEY: it always has index 0 is the highest priority
        //-> the next highest prioity objet is moved to the front of the queue when the head of the queue is removed

        while (students.size() > 0){
            System.out.println(students.remove());
        }






    }
}
