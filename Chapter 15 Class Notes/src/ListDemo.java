import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        LinkedList<String> staff = new LinkedList<String>();
        staff.addLast("Tony");
        staff.addLast("Steve");
        staff.addLast("Wanda");
        staff.addLast("Dr. Strange");
//The list is currenlt TSWD
        System.out.println(staff);
        
        //The list is currently TSWD

        /*
        the listterator method creates a new list iterator tha tis positioned at the head of the list. the | is used to represnet hte iterator position */
        //|TSWD
        ListIterator<String> iterator = staff.listIterator();

        //the next method advnace sthe iterator over the next element in the list
        iterator.next(); // T|SWD

        //the next method also returns the elemtns the iterator passes over

        String avenger = iterator.next();
        System.out.println(avenger); //Should print "Steve" --> TS|WD

        iterator.add("Natasha"); //TSN|WD
        iterator.add("Bruce"); //TSNB|WD

        /*The iterator add method inserts an element at the iterator positioned. The iterator is then positioned AFTER where the element is added (like typing)  */

        System.out.println(staff);

        /*remove method removes the elemnet returned by the last call to next or previous
        the remove method can ONLY be called after calling next or previous, cannot be called after calling add */
        iterator.next(); //TSNBW|D
        iterator.remove(); //wanda is removed: TSNB|D

        System.out.println(staff);

        /*the set method updates the element returned by the last call to next or previous */

        iterator.previous(); //TSN|BD
        iterator.set("T'Challa"); //TSN|T'Challa D

        System.out.println(staff);

        /*the hasNext method is used to determine is there is a next node after the iterator, often used as the condition of a while loop */

        iterator = staff.listIterator(); // |TSNTD

        while (iterator.hasNext()) {
            String n = iterator.next();
            if (n.equals("Natasha")) { //TSN|TD
                iterator.remove(); ///TS|TD
            }
        }

        System.out.println(staff);

        /*enhanced for loosp work with linked lists */
        //the enhanced for loop AUTOMATICALLY creates an iterator

        for (String n: staff) {
            System.out.println(n + " ");
        }

        //where did gogol live when he was a little boy
        //what did gogol remember after his first day with moushumi
        
        /*ConcurrentModificationExcpetion 
        
        you CANNOT modify a linked list while using an iterator
        UNLESS you use the iterator to do the modificaiton*/
        iterator = staff.listIterator(); // |TSTD

        while (iterator.hasNext()) {
            String n = iterator.next();
            if (n.equals("Tony")) {
                // staff.remove("Tony");ConcurrentModificationException
            }
        }

        for (String n: staff){
            if (n.equals("Tony")) {
                staff.add("Peter") //can't modify any type of data structure while using an iterator. you have to use the iterator yourself
            }
        }
    }

    



}
