public class Kata {
    
         public static boolean evenNumbers(int number) {
        //            int number = input.nextInt();
                    if(number % 2 == 0){
                        return true;
                    }
                        return false;
        }



        
    public static int differenceInNumbers(int firstNumber, int secondNumber){
 

        int differenceOfIntegers = Math.abs(firstNumber - secondNumber);
    
                 return differenceOfIntegers; 
    }



        
                public static int factorOfInteger(int number){
        
                    int totalOfFactor = 0;
            for(int count = 1; count <= number; count ++){
                if(number % count == 0){
                    totalOfFactor += 1;
                }
              
             
            }
                    return totalOfFactor;
            
            }



                public static long squareOfNumber(long number){

                  
//                int number = input.nextInt();
                
            long square = number * number;
                return square;
            
            }


                                                                                     
        public static boolean reverseNumber( boolean number){
    
        reverse = 0;
        int firstNumber = number / 10000;
        int secondNumber = number / 1000 % 10;
        int thirdNumber = number / 100 % 10;
        int fourthNumber= number / 10 % 10;
        int fifthNumber = number % 10;
        

        if(firstNumber == fifthNumber && secondNumber == fourthNumber){
            return true;
        }
        return false;
        }
           

            
               public static boolean squareNumber(int number){
                    
                for(int count = 1; count <= number; count ++){
                    if(count * count == number){
                      return true;
                }
                        return false;
                }

            }


  
}


}
