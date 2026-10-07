import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.TYPE_PARAMETER, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME) 
@interface CricketPlayer{
    String country() default "India";
    int age() default 30;
}

@CricketPlayer
class RohitSharma{

    @CricketPlayer 
    private int innings;

    @CricketPlayer
    public RohitSharma()
    {
    }

    
    public int getInnings() {
        return innings;
    }

    public void setInnings(@CricketPlayer int innings) {
        this.innings = innings;
    }

    


}
public class LaunchAnnotation2 {
    public static void main(String[] args) {
        RohitSharma rs = new RohitSharma();
        Class<? extends RohitSharma> cls = rs.getClass();
        CricketPlayer ann = cls.getAnnotation(CricketPlayer.class);
        String c = ann.country();
        int age = ann.age();
        System.out.println(c+" "+age); 
    }
}
