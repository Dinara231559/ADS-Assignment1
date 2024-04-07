import java.util.Scanner;
public class Problem10 {
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
