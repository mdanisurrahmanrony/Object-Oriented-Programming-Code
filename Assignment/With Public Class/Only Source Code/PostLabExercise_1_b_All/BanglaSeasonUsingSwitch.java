package PostLabExercise_1_b_All;
import java.util.Scanner;
public class BanglaSeasonUsingSwitch{

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter month number for print month name:");
        int month=sn.nextInt();
        switch (month) {
            case 1:
                System.out.println("Boishakh");
                break;
            case 2:
                System.out.println("Joishtho");
                break;
            case 3:
                System.out.println("Asharh");
                break;
            case 4:
                System.out.println("Srabon");
                break;
            case 5:
                System.out.println("Bhadro");
                break;
            case 6:
                System.out.println("Ashshin");
                break;
            case 7:
                System.out.println("Kartik");
                break;
            case 8:
                System.out.println("Ogrohaeon");
                break;
            case 9:
                System.out.println("Poush");
                break;
            case 10:
                System.out.println("Magh");
                break;
            case 11:
                System.out.println("Falgun");
                break;
            case 12:
                System.out.println("Choitro");
                break;
            default:
                System.out.println("You have entered wrong month number!!!");
                break;
        }
    }
}