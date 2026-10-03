import java.util.ArrayList;
import java.util.Collections;

public class LaunchCollections{
    public static void main(String[] args)
    {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("SpringBoot");
        courses.add("AI");
        courses.add("Devops");

        System.out.println(courses);

        Collections.shuffle(courses);
        int freq = Collections.frequency(courses, "Java");
        System.out.println(freq);
        System.out.println(courses);


    }
}