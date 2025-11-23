import java.util.Scanner;
    public class SquareOfInteger {
        public static void main(String...Odili){

        Scanner input = new Scanner(System.in);

            squareOfNumber();
        }

        public static void squareOfNumber(){
        Scanner input = new Scanner(System.in);
              
        System.out.println("Enter any integer of your choice ");
            int number = input.nextInt();

        int square = number * number;
        System.out.println("The Square of the integer " + number + " inputed is " + square);
        
        }


    }
     


