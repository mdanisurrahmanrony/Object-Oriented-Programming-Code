package PostLabExercise_1_b_All;
import java.util.Scanner;
public class BanglaSeasonUsingIfElse{

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter month number for print month name:");
        int month=sn.nextInt();
        if(month==1)
            System.out.println("Boishakh");  
        else if(month==2)
            System.out.println("Joishtho");
        else if(month==3)
            System.out.println("Asharh");
        else if(month==4)
            System.out.println("Srabon");
        else if(month==5)
            System.out.println("Bhadro");
        else if(month==6)
            System.out.println("Ashshin");
        else if(month==7)
            System.out.println("Kartik");
        else if(month==8)
            System.out.println("Ogrohaeon");
        else if(month==9)
            System.out.println("Poush");
        else if(month==10)
            System.out.println("Magh");
        else if(month==11)
            System.out.println("Falgun");
        else if(month==12)
            System.out.println("Choitro");
        else
            System.out.println("You have entered wrong month number!!!");
    }
}