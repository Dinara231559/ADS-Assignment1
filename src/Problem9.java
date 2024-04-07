import java.util.Scanner;
public class Problem9 {
    /**
     * Calculates the binomial coefficient for given n and k
     * @param n the total number of items
     * @param k the number of items to choose
     * @return the binomial coefficient for the given n and k
     */
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
