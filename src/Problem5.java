import java.util.Scanner;
public class Problem5 {
    /**
     * Calculates the Fibonacci number at the given position
     *
     * @param n the position in the Fibonacci sequence
     * @return the Fibonacci number at position n
     */
    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = fibonacci(n);
        System.out.println(result);
    }

}
