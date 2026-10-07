enum Result{
    PASS,FAIL,NR;

    static int rollno = 3;
    int marks;
    Result()
    {
        System.out.println("constructor of enum");
    }

    public void setMarks(int marks)
    {
        this.marks = marks;
    }

    public int getMarks()
    {
        return marks;
    }
}
public class LaunchEnum2 {
    public static void main(String[] args) {
        Result res = Result.PASS; 
        res.setMarks(44);
        System.out.println(res.getMarks());

        Result res1 = Result.FAIL;
        System.out.println(res1.getMarks());
        System.out.println(Result.rollno);
    }
}
