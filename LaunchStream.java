import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;
public class LaunchStream {
    public static void main(String[] args) {
        List<Integer> nums = List.of(4,6,7,5,2,9,1);
        
        Stream<Integer> stream = nums.stream();
        stream.forEach(n -> System.out.println(n));

        Predicate<Integer> isOdd = new Predicate<Integer>() {
            @Override
            public boolean test(Integer num)
            {
                return num%2 == 1;
            }
        };
        Stream<Integer> s2 = nums.stream();
        int sum1 = s2.filter(n -> n%2 == 1)
                    .mapToInt(n-> n*2)
                    .sum();

        int sum2= nums.stream()
                .filter(n -> n %2 == 1)
                .map(n -> n*2)
                .reduce(0, (c,e) -> c + e);
        System.out.println(sum2);
        System.out.println(sum1);
        List<Integer> oddNums = new ArrayList<>();
        List<Integer> doubledOddNumes = new ArrayList<>();

        for(int num : nums)
        {
            if(num%2 == 1)
            {
                oddNums.add(num);
            }
        }

        for(int num : oddNums)
        {
            doubledOddNumes.add(num*2);
        }

        int sum = 0;
        for(int num : doubledOddNumes){
            sum += num;
        }

    }


}
