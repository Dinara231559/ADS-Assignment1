import java.util.Scanner;
public class Problem8 {
    /**
     * Checks if a string consists only of digits
     * @param s the string to be checked
     * @param n the index of the current character in the string being checked
     * @return true if the entire string consists only of digits; {@code false} otherwise
     */
    public static boolean checkString(String s,int n){
            if(n == 0){
                return Character.isDigit(s.charAt(0));
            }
            else{
                return Character.isDigit(s.charAt(n))&&checkString(s,n-1);
            }
        }
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            int n = s.length()-1;
            boolean answer = checkString(s,n);
            if(answer){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
