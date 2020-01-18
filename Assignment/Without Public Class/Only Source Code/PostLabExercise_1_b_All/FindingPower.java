package PostLabExercise_1_b_All;
import java.util.Scanner;
public class FindingPower{

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter base number:");
        int base=sn.nextInt();
        System.out.println("Enter exponent:");
        int exponent=sn.nextInt();
        System.out.println(base+" to the power "+exponent+" is "+Power(base,exponent));
  }
    public static int Power(int base, int exponent){
        if(exponent==0)
            return 1;
        else
            return base*Power(base,exponent-1);
    }
}