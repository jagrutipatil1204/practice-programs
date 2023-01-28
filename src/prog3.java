import java.util.Scanner;

public class prog3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no of table");
        int a=sc.nextInt();
        for(int i=1; i<=10;i++){
           int b=i*a;
           System.out.println(b);
        }
    }
}

