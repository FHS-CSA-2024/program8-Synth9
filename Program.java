//import stuff here
import java.util.Scanner;

//Your code here
public class Program8{
    public static int getNumber(int number){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number " + number + ": ");
        return input.nextInt();
    }
    
    public static int getSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    
    public static int getDifference(int a, int b){
        int difference = a - b;
        return difference;
    }
    
    public static int getProduct(int a, int b){
        int product = a * b;
        return product;
    }
    
    public static double getAverage(int a, int b){
        double average = (a + b) / 2.0;
        return average;
    }
    
    public static int getAbs(int a, int b){
        int abs = Math.abs(a - b);
        return abs;
    }
    
    public static int getMax(int a, int b){
        if (a > b){
            return a;
        }
        else{
            return b;
        }
        
    }
    
    public static int getMin(int a, int b){
        if (a < b){
            return a;
        }
        else{
            return b;
        }
    }
    
    public static void main(String[] args){
        int number1 = getNumber(1);
        int number2 = getNumber(2);
        System.out.println("------------------------------\nOriginal numbers are " + number1 + " and " + number2 + "\n");
        
        int sum = getSum(number1, number2);
        System.out.println("Sum = " + sum + "\n");
        
        int difference = getDifference(number1, number2);
        System.out.println("Difference  = " + difference + "\n");
        
        int product = getProduct(number1, number2);
        System.out.println("Product = " + product + "\n");
        
        double average = getAverage(number1, number2);
        System.out.println("Average = " + average + "\n");
        
        int abs = getAbs(number1, number2);
        System.out.println("Absolute Value = " + abs + "\n");
        
        int max = getMax(number1, number2);
        System.out.println("Maximum = " + max + "\n");
        
        int min = getMin(number1, number2);
        System.out.println("Minimum = " + min + "\n");
        }
    }

//Paste console output below:
/*
Enter number 1: 13
Enter number 2: 20
------------------------------
Original numbers are 13 and 20

Sum = 33

Difference  = -7

Product = 260

Average = 16.5

Absolute Value = 7

Maximum = 20

Minimum = 13


*/
