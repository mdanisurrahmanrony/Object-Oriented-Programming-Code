package PostLabExercise_2;
import java.util.Scanner;
public class SmallestNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a,b,c,result;
        System.out.print("Input the first number: ");
        a=sc.nextDouble();
        System.out.print("Input the Second number: ");
        b=sc.nextDouble();
        System.out.print("Input the third number: ");
        c=sc.nextDouble();
        result=smallest(a,b,c);
        System.out.println("The smallest value is "+result);
    }
    public static double smallest(double a,double b,double c){
        if(a<b && a<c)
            return a;
        else if(b<c)
            return b;
        else
            return c;
    }
}
