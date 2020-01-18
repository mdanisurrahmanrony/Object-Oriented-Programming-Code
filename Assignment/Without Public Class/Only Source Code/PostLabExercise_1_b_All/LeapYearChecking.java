package PostLabExercise_1_b_All;
import java.util.Scanner;
public class LeapYearChecking {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter year for leap year check:");
        int year=sn.nextInt();
        if(year%4 != 0 || year%100 == 0&&year%400 != 0)
            System.out.println(year+" is not a leap year");
        else
            System.out.println(year+" is a leap year");
    }
    
}
