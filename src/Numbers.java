import java.util.Scanner;

public class Numbers
{
    public static void main (String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter any number: ");
        int key = scanner.nextInt();

        switch (key)
        {
            case 0:
                System.out.println("number 0 is pressed");
                break;
            case 1:
                System.out.println("number 1 is pressed");
                break;
            case 2:
                System.out.println("number 2 is pressed");
                break;
            case 3:
                System.out.println("number 3 is pressed");
                break;
            case 4:
                System.out.println("number 4 is pressed");
                break;
            case 5:
                System.out.println("number 5 is pressed");
                break;
            case 6:
                System.out.println("number 6 is pressed");
                break;
            case 7:
                System.out.println("number 7 is pressed");
                break;
            case 8:
                System.out.println("number 8 is pressed");
                break;
            case 9:
                System.out.println("number 9 is pressed");
                break;
            default:
                System.out.println("not allowed");
        }
    }
}






