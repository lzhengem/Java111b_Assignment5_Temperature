/**
  *This is the tempature class
  *with 4 constructors and a
  *readInput method that reads users input
  *@author(s) Chien Lin, Lena Zheng, Qian dong Li
  *@version 1.0
  *@since 2017-10-22
  */

import java.util.Scanner;


public class Temperature {
    double degree;
    char type;
    //creating a scanner for user input
    Scanner input = new Scanner(System.in);
           
    // to specify both parameters (degrees, type)
    public Temperature(double degree, char type){
    degree = degree;
    type = type;
    }

    //to specify just the degrees (defaults to type Celsius)
    public Temperature(double degree){
    degree = degree;
    type = 'C';
    }

    //to specify just the type (defaults to 0.0 for the degrees value)
    public Temperature(char type){
    type = type;
    degree = 0.0;
    }

    // the default constructor that specifies neither (defaults to 0 degrees Celsius)
    public Temperature(){
    type ='C';
    degree= 0;
    }  

    //prompt user for degrees and type and then reads the values
    public void readInput(){
    //prompts user to for tempature in degrees
    System.out.println("Enter a temperature in degress ");
    degree = input.nextDouble();
    //prompts user for degrees in fahrentheit (f) or Celsius (c)
    System.out.println("Enter 'F' (or 'f') for Fahrenheit or 'C' (or 'c') for Celsius:");
    input.next();
    //convert user input to a char
    char type[]=input.next().toCharArray();
    }   
        
}
