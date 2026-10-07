enum Week{
    MON, TUE, WED, THU, FRI, SAT, SUN;
}
public class EnumAndAnnotation {
    public static void main(String[] args) {
        Week week = Week.THU; 
        System.out.println(week);
        System.out.println(Week.THU.ordinal());
        Week[] weeks = Week.values();
        for(Week w : weeks)
        {
            System.out.println(w);
        }
    }
}
