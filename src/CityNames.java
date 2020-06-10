import java.util.Scanner;

public class CityNames
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter alphabet from a to f: ");
        char city = scanner.next().charAt(0);

        switch (city)
        {
            case 'a':
                System.out.println("Ahemdabad");
                break;

            case 'b':
                System.out.println("Bhopal");
                break;

            case 'c':
                System.out.println("Chandigarth");
                break;

            case 'd':
                System.out.println("Delhi");
                break;

            case 'e':
                System.out.println("Etah");
                break;
            case 'f':
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid entry");
        }


    }
}
