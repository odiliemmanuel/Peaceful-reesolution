    import java.util.Scanner;
        public class ForLoop {
            public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = 45;

    System.out.println("Enter a random number: ");
    int numberRand = input.nextInt();

    numberRand = 0;

    for(int count = 0; count <= 100; count ++);

    
        if(numberRand < number){
            System.out.println("Number is too low, guess again");
          }
         if(numberRand > number) {
            System.out.println("Number is too high, guess again");
        }

        if (numberRand == number){
            System.out.println("Number Guessed Correctly, the number is " + number);
        }


            }
        }
