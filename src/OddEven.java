import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        int num = scanner.nextInt();

        switch (num%2)
        {
            case 0:
                System.out.println("Even number: ");
                break;
            case 1:
                System.out.println("Odd number ");
        }
    }
}
