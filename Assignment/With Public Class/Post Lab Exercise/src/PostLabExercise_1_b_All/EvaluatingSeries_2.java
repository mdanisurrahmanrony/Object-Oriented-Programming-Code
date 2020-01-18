package PostLabExercise_1_b_All;
import java.util.Scanner;
public class EvaluatingSeries_2{

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter length of the Series /number of elements");
        int sum=0,stop_point=sn.nextInt(),i;
        System.out.print("Series is: ");
        for(i=1;i<=stop_point;i++){
            if(i%2==0){
                sum+=(-i);
                 System.out.print("-"+i);
            }
            else{
                sum+=i;
            if(i==1)
                System.out.print(i);
            else
                System.out.print("+"+i);
            }
    }
        System.out.println("\nSum of the series is: "+sum);
  }
}