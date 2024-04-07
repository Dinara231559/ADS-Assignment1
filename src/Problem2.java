import java.util.Scanner;
public class Problem2 {
    /**
     * Calculates the average of the values in an array.
     *
     * @param n the number of elements in the array
     * @param arr the array containing the integers
     * @return the average of the array values as a double
     */
    public static double findAverage(int n, int[] arr){
        double sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        return sum/n;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n; i++){
            arr[i] = scanner.nextInt();
        }
        double average = findAverage(n, arr);
        System.out.println(average);
    }

}
