import java.util.Scanner;
public class Problem3 {
    /**
     * Determines if the given integer is prime
     *
     * @param n the number to check
     * @return a string indicating if n is "prime", "composite", or "neither prime nor composite"
     */
    public static String checkPrime(int n){
        if(n < 2){
            return "neither prime nor composite";
        }
        for(int i = 2; i <= Math.sqrt(n);i++){
            if (n % i == 0 ){
                return "composite";
            }
        }
        return "prime";
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String result = checkPrime(n);
        System.out.println(result);
    }

}
