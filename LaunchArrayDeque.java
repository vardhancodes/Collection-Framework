import java.util.ArrayDeque;
public class LaunchArrayDeque{
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();

        ad.addFirst(7);
        ad.addLast(8);
        ad.add("Telusko");
        ad.add(45.5);
        System.out.print(ad);
    }
} 