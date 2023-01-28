import java.util.Scanner;

public class demo2 {
    public static void addition(int x , int y){
        System.out.println(x+y);

    }public static void substraction(int x , int y){
        System.out.println(x-y);

    }
    public static void multiplication(int x , int y){
        System.out.println(x*y);

    }
    public static void division(int x , int y){
        System.out.println(x/y);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ");
        int a =sc.nextInt();
        System.out.println("Enter b ");
        int b =sc.nextInt();
        System.out.println("Enter a choice");
        int condition = sc.nextInt();
        if (condition == 1){
            addition(a, b);
        } else if (condition == 2){
            substraction(a, b);
        } else if (condition==3) {
            multiplication(a, b);
        } else if (condition==4) {
            division(a, b);
        }else{
            System.out.println("Enter a valid option");
        }
        sc.close();
    }
}
