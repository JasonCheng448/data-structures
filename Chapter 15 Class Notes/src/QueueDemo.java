import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * This program simulates a print queue. Note that documents are printed
 * in the same order as they are submitted.
*/
public class QueueDemo
{
    public static void main(String[] args)
    {
        //create a print queuue of string with a linked list

        Queue<String> jobs = new LinkedList<>();

        //add some print jobs

        jobs.add("Jason: Quarter 2 Expense Report");
        jobs.add("Evan: Recipe for Banana Bread");
        jobs.add("Emily: Top Secret Document");

        System.out.println("Printing: " + jobs.remove());

        //Add some more print jobs

        jobs.add("Noah: Grocery List");
        jobs.add("Emily: Really Top Secret Document");
        jobs.add("Emily: Can I Get Fired for This?");

        System.out.println("Printing: "+jobs.remove());
        System.out.println("Printing: " + jobs.remove());

        jobs.add("Boss: Emily's Termination Letter");

        /*
        for (int i = 0; i < jobs.size(); i ++){
            System.out.println("Printing: "+jobs.remove());
        }
        */

        while (jobs.size() != 0){
            System.out.println("Printing: "+jobs.remove());
        }

        //create a todo list
        //the WordOrder class has an int priority and a string descripiton
        Queue<WorkOrder> toDo = new PriorityQueue<>();
        //lower priority is considered more importnat
        toDo.add(new WorkOrder(3, "Water Plants"));
        toDo.add(new WorkOrder(2, "Make Dinner"));
        toDo.add(new WorkOrder(1, "Conquer world"));
        toDo.add(new WorkOrder(9, "Sutdy for the Ch. 15 Test"));

        System.out.println(toDo);

        while (toDo.size() > 0){
            System.out.println(toDo.remove());
        }


    }   
}
