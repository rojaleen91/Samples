import java.util.Scanner;

public class Reversenumber {
    public static void main(String args[]) {
        int num, r,reverse_number = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no to reverse:");
        num = input.nextInt();


            while(num>0) {
                r = num % 10;
                reverse_number =reverse_number *10+r;
                num=num/10;



            }

            System.out.println(reverse_number);

    }}
