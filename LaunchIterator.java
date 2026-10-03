
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
public class LaunchIterator {
    public static void main(String[] args) {
        
        CopyOnWriteArrayList al1 = new CopyOnWriteArrayList();
        al1.add("A");
        al1.add("C");
        al1.add("E");
        al1.add("D");

        Iterator itr = al1.iterator();
        while(itr.hasNext())
        {
            String item = (String)itr.next();
            System.out.println(item);
        }

        ListIterator l1 = al1.listIterator(2);

        while(l1.hasNext())
        {
            String item = (String)l1.next();
            System.out.println(item);
        }

        while(l1.hasPrevious())
        {
            String item = (String)l1.previous();
            System.out.println(item);
        }


        System.out.println(al1);




    }
    
}
