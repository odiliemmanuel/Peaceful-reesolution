    import java.util.Scanner;
        public class PrimeNumber {
            public static void main(String...Odili) {
                Scanner input = new Scanner(System.in);


            System.out.println("Enter any Integer ");
                int number = input.nextInt();


        int remainder = 0;
        int numberOfFactor = 0;

            for(int index = 1; index <= number; index ++){
                if(numberOfFactor == 0){
                    numberOfFactor ++;
                }
            }
                if(numberOfFactor > 2){
                    System.out.println("Not Prime");
                }
                else{
                    System.out.print("Prime");
               
                }
            
            }
        }
