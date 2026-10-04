import java.util.*;


class Alpha implements Comparator<Cricketer>
{
    public int compare(Cricketer c1 , Cricketer c2)
    {
        if (c1.avg > c2.avg) {
            return 1;
        } else if (c1.avg < c2.avg) {
            return -1;
        } else {
            return 0;
        }
    } 
}
class Cricketer{
    String name;
    int age;
    double avg;

    public Cricketer()
    {

    }

    public Cricketer(int age, String name, double avg)
    {
        super();
        this.age = age;
        this.name = name;
        this.avg = avg;
    }

    @Override
    public String toString()
    {
        return "\n Cricketer is : "+name+"\n Age : "+age+"\n Average is : "+avg+"\n"; 
    }

}
public class LaunchComplex1 {
    public static void main(String[] args) {
        ArrayList<Cricketer> list = new ArrayList<>();
        list.add(new Cricketer(34,"SKY",56.4));
        list.add(new Cricketer(33,"Sanju",66.4));
        list.add(new Cricketer(30,"SKY",46.4));

        Alpha a = new Alpha();
        Collections.sort(list,a);
        System.out.println(list);
    }
}
