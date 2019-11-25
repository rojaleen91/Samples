import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        int x, y, temp;
        System.out.println("Enter x and y");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("Before Swapping" + x + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping" + x + y);

    }

}
