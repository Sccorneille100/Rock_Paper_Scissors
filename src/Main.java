import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner scanner= new Scanner(System.in);

        System.out.println("What would like to be Rock (r), Paper(p), scissors(s)");
        String letter = scanner.next();
        String yourchoice = String.valueOf(letter.charAt(0));
        System.out.println("You hava chosen " + yourchoice);

        String answer = choice();

        result(yourchoice, answer);

    }

    public static void result(String your_Choice, String answer) {
        char one= your_Choice.charAt(0);
        char two= answer.charAt(0);

        if (one == two){
            System.out.println("This is a tie");
        }
        else if (one =='r' && two=='s'){
            System.out.println("you win ");
        }
        else if (one =='s' && two =='p'){
            System.out.println("you win");
        } else if (one =='p' && two =='r') {System.out.println("you win big");


        } else {System.out.println("you lost");}
    }


    public static String choice(){
               byte temp= (byte) (Math.random()*3);
                return (conversion(temp));
    }

    public static String conversion(byte a){
        return switch (a) {
            case 0 -> "r";
            case 1 -> "p";
            case 2 -> "s";
            default -> null;
        };
    }

}