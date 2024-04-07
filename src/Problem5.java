import java.util.Scanner;
public class Problem5 {
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
