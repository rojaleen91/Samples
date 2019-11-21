import java.util.Scanner;

public class AdditionNumbers {
    public static void main(String args[])
    {
        int num1,num2,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int number1=sc.nextInt();
        System.out.println("Enter Second Number: ");
        int number2=sc.nextInt();
        sc.close();
        sum=number1+number2;
        System.out.println("Sum  of Two Number:"+sum);
    }
}
