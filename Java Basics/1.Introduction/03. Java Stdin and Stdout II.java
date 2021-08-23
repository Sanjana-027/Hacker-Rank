import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int    num1 = scan.nextInt();
        double num2 = scan.nextDouble();
        scan.nextLine();
        String sentences = scan.nextLine();
        

        System.out.println("String: " + sentences);
        System.out.println("Double: " + num2);
        System.out.println("Int: " + num1);
    }
}
