import java.util.Scanner;
public class Problem1 {
    public static int findMin(int n,int[] arr) {
        int minValue = arr[0];
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i < n;i++){
            arr[i] = scanner.nextInt();
        }
        int min = findMin(n,arr);
        System.out.println(min);

    }
}