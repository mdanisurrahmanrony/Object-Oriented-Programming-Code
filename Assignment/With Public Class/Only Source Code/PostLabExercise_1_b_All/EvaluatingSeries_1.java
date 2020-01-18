package PostLabExercise_1_b_All;
import java.util.Scanner;
public class EvaluatingSeries_1{

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter length of the Series /number of elements");
        int num=12,sum=0,stop_point=sn.nextInt(),i;
        System.out.print("Series is: ");
        for(i=1;i<=stop_point;i++){
            sum+=num;
            if(i==1)
                System.out.print(num);
            else
                System.out.print("+"+num);
            num+=20;
        }
        System.out.println("\nSum of the series is: "+sum);
    }
}
