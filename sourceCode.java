import java.util.Scanner; //Scanner feature imported

public class sourceCode {

    public static void averageOut (double n1, double n2) //
        {
             double average = n2/n1; // the average formula is assigned to the double average
             System.out.println("The average is " + average); // output is given to user displaying the average
        }
    
    public static boolean primeNumberRet (double n1) //
        {
                boolean isItPrime = true; //  the boolean ‘is it prime’ is true…
 
                if(n1 <= 1) // if the double n1 is less than or equal to 1
                    {
                    isItPrime = false; // it is not a prime number
                    return isItPrime; // output to the user the result of ‘is it prime’
                    }
                else
                    {
                        for (int i = 2; i<= n1/2; i++) // declaring for loop
                        {
                            if ((n1% i) == 0)
                            {
                            isItPrime = false; // it is not a prime number
                            }
                        }
                    }
                return isItPrime; // output to the user the result of is it prime
                
        }
        
    public static void speedOut (double n1, double n2) //
        {
                double speed = n1/n2; // the double speed is assigned the formula for speed
                System.out.println("The speed is " + speed + "units per time."); // output to the user the speed value
        }
    
    public static void perimeterOut (double n1, double n2) //
        {
                double perimeter = 2*(n1 + n2); // the double perimeter is assigned the formula to calculate perimeter
                System.out.println("The perimter is " + perimeter + "units."); // output to the user the perimeter
        }
    
    public static void missingAngleOut (double n1, double n2) //
        {
                
                int sumOfAngles = 180; // sum of angles is assigned the value 180
                
                double thirdAngle = sumOfAngles - (n1 + n2); // the third angle is given a formula to find the missing angle
                System.out.println("The third angle is " + thirdAngle); // outputs the value of the third angle)
        }
    
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in); //New scanner declared
        
        int choice; //integer choice variable declared - holds user’s option
        double distance; //double distance variable declared - holds distance value
        double time; //double time variable declared - holds time value
        double length; //double length variable declared - holds length value
        double width; //double distance variable declared - holds distance value
        double firstAngle; //double firstAngle variable declared - holds first angle value
        double secondAngle; //double secondAngle variable declared - holds second angle value
        double primeNumQuestion; //double primeNumQuestion variable declared - holds number to be verified
        int averageNumber; //integer averageNumber variable declared - holds number of values average needs to be found of      
        
        do { //do while loop used the program until the while condition is not met
                    System.out.println("---Subroutines Program---"); //header
                    System.out.println(" "); //space
                    System.out.println("Please enter your choice: "); //user question
                    System.out.println("1... Find the average"); //option 1
                    System.out.println("2... Verify if the number is prime"); //option 2
                    System.out.println("3... Find the speed"); //option 3
                    System.out.println("4... Find the perimeter of a rectangle"); //option 4
                    System.out.println("5... Find the missing angle in a triangle"); //option 5
                    System.out.println("Enter 0 to exit the program"); //option 6 allows user to exit program
                    System.out.print("Please enter your choice: "); //collects user's option
                    choice = keyedInput.nextInt(); //response to above question stored as choice
                    System.out.println(" "); //space
                    System.out.println("--------------------------------"); //line
                    
                    switch (choice){ //switch case used - if choice equals to…
                        case 1: //choice = 1 then average calculator will run
                            System.out.println("Enter the number of values you would like to find the average of: "); //user instruction
                            averageNumber = keyedInput.nextInt(); //number of values average needs to be found of - stored as averageNumber
                            
                            double averageValues [] = new double [averageNumber]; //array declared size is user’s input (averageNumber)
                            double total = 0; //double variable total declared and initialized to the value of 0
                            
                            System.out.println("Enter the value one by one: "); //user instruction to enter value
                                for(int i=0; i<averageNumber; i++){ //for loop declared
                                    averageValues[i] = keyedInput.nextInt(); //user entered values are stored
                                    total = total + averageValues [i]; //averageValues are added to total
                                }
                            System.out.println(" ");   //space
                            averageOut (averageNumber, total); //method averageOut is called
                                
                            break;
                            
                        case 2:
                            System.out.print("Enter a number: "); //user instruction
                            primeNumQuestion = keyedInput.nextDouble(); //reponse stored as primeNumQuestion
                            
                            boolean isItPrime = primeNumberRet(primeNumQuestion); //method primeNumerRet is called
                            
                            System.out.println(" "); //space
                                if (isItPrime) //boolean for prime number to be verified
                                {
                                System.out.println(primeNumQuestion  + " is a prime number."); //if the number is prime then the statement is outputted
                                }
                                else
                                {
                                System.out.println(primeNumQuestion + " is not a prime number."); //if the number is not prime then the statement is outputted
                                }
                            break;
                            
                        case 3:
                            System.out.print("Enter the distance: "); //user instruction to enter distance
                            distance = keyedInput.nextDouble(); //stores user’s input as double distance
                            System.out.print("Enter the time: "); //user instruction to enter time
                            time = keyedInput.nextDouble(); //stores user’s input as time distance                            
                            System.out.println(" "); //space
                            speedOut (distance, time); //method speedOut is called
                            break;
                           
                        case 4:
                            System.out.print("Enter the length of rectangle: "); //user instruction to enter length of rectangle
                            length = keyedInput.nextDouble(); //stores user’s input as double length
                            System.out.print("Enter the wdith of rectangle: "); //user instruction to enter width of rectangle
                            width = keyedInput.nextDouble(); //stores user’s input as double width
                            
                            System.out.println(" "); //space
                            perimeterOut(length, width); //method perimeterOut is called
                            
                            break;
                            
                        case 5:
                            System.out.print("Enter the first angle: "); //user instruction to enter first angle

                            firstAngle = keyedInput.nextDouble(); //stores user’s input as double firstAngle
                            System.out.print("Enter the second angle: ");//user instruction to enter second angle
                            secondAngle = keyedInput.nextDouble(); //stores user’s input as double secondAngle                            
                            System.out.println(" "); //space
                            missingAngleOut(firstAngle,secondAngle); //method missingAngleOut is called
                            break;
                            
                    }   
                    } while (choice != 0); //while part of the do while loop - 0 exits the program

            keyedInput.close();
        
    }
    
}