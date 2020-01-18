package PostLabExercise_1_b_All;
import java.util.Scanner;
public class SmallestNumberInArray{
    public static void main(String[] args) {
        int i,num,smallest;
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter number of array elements");
        num=sn.nextInt();
        int array[]=new int[num];
        System.out.println("Enter numbers to check smallest");
        for(i=0;i<num;i++){
            array[i]=sn.nextInt();
        }
        smallest=array[0];
        for(i=0;i<num;i++){
            if(smallest>array[i])
                smallest=array[i];
        }
        System.out.println("Smallest number among the numbers is: "+smallest);
    }
}