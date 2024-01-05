import java.util.*;
public class inputOutput {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        // System.out.println("The character is ");
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(1);
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(0);
        } else {
            System.out.println(-1);
        } 
    }
}