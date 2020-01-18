package PostLabExercise_1_b_All;
import java.util.Scanner;
public class LargestNumberInArray{
    public static void main(String[] args) {
        int i,num,largest;
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter number of array elements");
        num=sn.nextInt();
        int array[]=new int[num];
        System.out.println("Enter numbers to check largest");
        for(i=0;i<num;i++){
            array[i]=sn.nextInt();
        }
        largest=array[0];
        for(i=0;i<num;i++){
            if(largest<array[i])
            	largest=array[i];
        }
        System.out.println("Largest number among the numbers is: "+largest);
    }
}