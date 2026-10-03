import java.util.*;
public class LaunchTreeSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);
        ts.add(100);
        System.out.println(ts);
        System.out.println(ts.higher(50));



    }
}
 