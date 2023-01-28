import java.util.Scanner;

public class prog2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a radius");
        float r=sc.nextFloat();
        double ac=(22*r*r)/7;
        System.out.println("Area of circle is" +ac);


    }
}
