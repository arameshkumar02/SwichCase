import java.util.Scanner;

public class Vowels
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any alphabet: ");
        char vow = scanner.next().charAt(0);

        switch (vow)
        {
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("Constant");
        }
    }
}
