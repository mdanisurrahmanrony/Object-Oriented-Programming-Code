package PostLabExercise_1_b_8;
import java.util.Scanner;
public class SortingInAscendingOrder{
    public static void main(String[] args) {
        int i,j,length,temp;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter array length");
        length=sn.nextInt();
        int[] array=new int[length];
        System.out.println("Enter numbers for ascending order");
        for(i=0;i<length;i++){
            array[i]=sn.nextInt();
        }
        System.out.print("Array without sorting: ");
        for(i=0;i<length;i++){
            System.out.print(array[i]+" ");
        }
        for(i=0;i<length;i++){
            for(j=0;j<length-1-i;j++){
                if(array[j]>array[j+1]){
                    temp= array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
        }
        }
        System.out.print("\nArray sorted in ascending order: ");
        for(i=0;i<length;i++){
            System.out.print(array[i]+" ");
        }
    }
}