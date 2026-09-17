import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        /**
         * the map interface is generic.
         * The first type is the key
         * the second type is the value
         */
        Map<String, Color> favColors = new HashMap<>();

        //add elements

        favColors.put("Jason", Color.BLUE);
        favColors.put("Emily", Color.RED);
        favColors.put("Evan", Color.GREEN);

        //two different elemnets can have the same value

        favColors.put("Ethan", Color.GREEN);
        favColors.put("Emily", Color.ORANGE); //replaces the original Emily -> Color.RED ; changes the value like changing a variable.
        //same key CANNOT have 2 different values
        
        //Create a set of the keys in the map
        Set<String> keys = favColors.keySet();

        for (String key: keys){
            //print [name] ([hashCode]: [color])
            System.out.println(key + " (" + key.hashCode() + ") : " + favColors.get(key)); //tai got a 2 in ap physics
        }


    }
}
