package PostLabExercise_1_b_All;
import java.util.Scanner;
public class Factorial{

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter number for Factorial:");
        int num=sn.nextInt();
        System.out.println("Factorial of "+num+" is "+Factorial(num));
  }
    public static int Factorial(int num){
        if(num==0 || num==1)
            return num;
        else
            return num*Factorial(num-1);
    }
}