import java.util.Scanner;
public class Problem9 {
    public static int findBinomialCoefficient(int n, int k){
        if(k == 0 || k == n){
            return 1;
        }
        return findBinomialCoefficient(n - 1, k - 1) + findBinomialCoefficient(n - 1, k);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = findBinomialCoefficient(n,k);
        System.out.println(result);
    }
}
