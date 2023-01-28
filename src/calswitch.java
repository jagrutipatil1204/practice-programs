import java.util.Scanner;

public class calswitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no a");
        int a = sc.nextInt();
        System.out.println("Enter a no b");
        int b = sc.nextInt();
        System.out.println("Enter your choice:");
        int mn = sc.nextInt();
        switch (mn) {
            case 1:
                System.out.println("Answer is" + (a + b));
                break;
            case 2:
                System.out.println("Answer is" + (a - b));
                break;
            case 3:
                System.out.println("Answer is" + (a * b));
                break;
            case 4:
                System.out.println("Answer is" + (a / b));
                break;
            case 5:
                System.out.println("Answer is" + (a % b));
                break;
            default:
                System.out.println("Error");
        }
    }
}

