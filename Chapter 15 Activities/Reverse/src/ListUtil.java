import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        ListIterator<String> iterator = strings.listIterator(strings.size());

        LinkedList<String> temp = new LinkedList<String>();

        while (iterator.hasPrevious()){
            String x = iterator.previous();
            temp.add(x);
        }

        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        
        ListIterator<String> tempIterator = temp.listIterator();

        while (tempIterator.hasNext()){
            String x = tempIterator.next();
            strings.add(x);
        }



        
        

    }
}