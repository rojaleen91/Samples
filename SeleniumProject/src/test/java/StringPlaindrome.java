import java.util.Scanner;

public class StringPlaindrome {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String to reverse: ");
        String s=sc.nextLine();
        String palindrome="";
        for (int i=s.length()-1;i>=0;i--)
        {
            palindrome=palindrome+s.charAt(i);

        }
        System.out.println(palindrome);
        if(palindrome.contentEquals(s)) {
            System.out.println("String is palindrome");
        }
        else
            System.out.println("not palindrome");
    }
}
