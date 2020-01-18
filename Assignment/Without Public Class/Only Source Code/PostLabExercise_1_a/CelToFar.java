package PostLabExercise_1_a;
import java.util.Scanner;
public class CelToFar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a degree in Celsius: ");
        double cel=sc.nextInt();
        double far=(((9*cel)/5)+32);
        System.out.println(cel+" degree Celsius is equal to "+far+" in Fahrenheit");
        //sc.close();
    }    
}
