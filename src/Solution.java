import java.time.Clock;

public class Solution {
    public static String run(int N, int M) {
        /*
         * Some work here; return type and arguments should be according to the problem's requirements
         */
        String sequence = "";
        for(int i = N; i <= M; i++){
            if(i % 3 == 0 & i%5 ==0){
                sequence += "FizzBuzz";
            }
            else if(i % 3 == 0){
                sequence += "Fizz";
            }
            else if(i % 5 == 0){
                sequence += "Buzz";
            }
            else{
                sequence += i;
            }
            if (i < M){
                sequence += ",";
            }

        }
        return sequence;
    }

    public static void main(String[] args) {
        String test  = run(1,15);
        System.out.println(test);
    }
}
