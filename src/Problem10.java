import java.util.Scanner;
public class Problem10 {
    /**
     * Calculates the GCD of two integers a and b
     * @param a the first integer
     * @param b the second integer
     * @return the Greatest Common Divisor of a and b
     */
    public static int findGCD(int a,int b){
        if(b == 0){
            return a;
        }
        return findGCD(b, a % b);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = findGCD(a,b);
        System.out.println(result);
    }
}
