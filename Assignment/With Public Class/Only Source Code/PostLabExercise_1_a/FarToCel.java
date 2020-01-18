package PostLabExercise_1_a;
import java.util.Scanner;
public class FarToCel {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double far=sc.nextInt();
        double cel=(((far-32)/9)*5);
        System.out.println(far+" degree Fahrenheit is equal to "+cel+" in Celsius");
        //sc.close();
    }
}
