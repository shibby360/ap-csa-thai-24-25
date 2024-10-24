import java.util.Scanner;

//Do not run the code. Comment on each line of code and state what each section/line of code does
public class MinMax{
    static int max = Integer.MIN_VALUE; // makes variable "max" of integer.min_value
    static int num =0; // makes variable "num" of 0
    public static void main(String[] args) {
        askMax();
    } // main method, runs askMax() method
    public static void askMax(){
        while(num!=962024){ // runs while "num" is not 962024
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a integer, type 962024 to end the loop");
            // creates scanner and asks user to input integer
            try{
                num = sc.nextInt();
            } // checks if "num = sc.nextInt()" had an error, if it did, it goes to the catch block
            catch(Exception e){
                System.out.println("That is not a valid input.");
            } // To figure out what this try/catch does. Attempt to comment out lines all the lines between here and the "enter integer", except for the num = sc.nextInt()
            // Run the code and try a bunch of different inputs.

            if(num>max){
                max = num;
                System.out.println("The new max is "+max + "\n\n");
            } // if num > max then sets max to the new num
            else{
                System.out.println(num + " is not larger than the old max of " + max + "\n\n");
                //once you get a chance to type here try to uncomment the line below and guess what happens
                break; // stops loop
            } // otherwise it says the num is not larger than the old max, and then stops loop
            
        }
       

    }

}
// when the user inputs an integer other than 962024, 
// it sets the new max to the greatest of all the values entered
// if the user doesn't input an integer it just tells the user to try again
// if the user inputs 962024 then the loop stops


































// OOOOOOgaaaBooogaBoooga Thou shau not run comment this out later to test code
//When you finally run the code try a bunch of inputs, such as strings, doubles, booleans and see what happens in the code.