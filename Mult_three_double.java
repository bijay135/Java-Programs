package Programs;
import java.util.Scanner;
public class Mult_three_double {
    public static void main(String[] args){
        double a,b,c,mult;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the first floating number : ");
        a=S.nextInt();
        System.out.println("Enter the second floating number : ");
        b=S.nextInt();
        System.out.println("Enter the third floating number : ");
        c=S.nextInt();
        mult=a*b*c;
        System.out.println("The multiplication of three floating number is : "+mult);
    }
}
