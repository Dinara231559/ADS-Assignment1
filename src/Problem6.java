import java.util.Scanner;
public class Problem6 {

    /**
     * Calculates the power of a
     * @param a the base number
     * @param n the exponent
     * @return the result of a raised to the power of n
     */
    public static double findPower(int a,int n){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 1/ findPower(a, -n);
        }
        return a * findPower(a, n-1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        double result = findPower(a,n);
        System.out.println(result);

    }
}
