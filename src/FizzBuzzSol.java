import java.util.ArrayList;
import java.util.List;

public class FizzBuzzSol {

    public static void main(String[] args) {
        FizzBuzzSol fB = new FizzBuzzSol() ;
        System.out.println(fB.fizzBuzz(5));
    }
        public List<String> fizzBuzz(int n) {
            List<String> result = new ArrayList<>();
            for(int i=1; i<=n; i++){
                if(i% 3==0 && i% 5==0 ) {
                    result.add("FizzBuzz");
                }
                else if(i% 3==0) {
                    result.add("Fizz");
                }
                else if(i% 5==0) {
                    result.add("Buzz");
                }
                else{
                    result.add(Integer.toString(i));
                }
            }
            return result;
        }
}



