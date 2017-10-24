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
        //convert user input to a char
        type = input.next().toUpperCase().charAt(0);
    }

    // conversion function to convert degree parameter between Farenheit and Celcius
    private double convertTemp(double p_degrees, char from_type, char to_type){
        double out_degree = 0;
        from_type = Character.toUpperCase(from_type);
        to_type = Character.toUpperCase(to_type);
        if (from_type == to_type) {
           out_degree = p_degrees;
        }
        else {
            if (from_type == 'C' && to_type == 'F'){
                out_degree = (p_degrees * 1.8) + 32;
            }
            else {
                if (from_type == 'F' && to_type == 'C'){
                    out_degree = (p_degrees - 32)/1.8;
                }
            } 
        }
        return out_degree;
    }

    //print out parameter degreeand type, for debugging
    public void writeOutput(){
        System.out.println("Temperature = " + degree + " degrees "+ type + ".");
    }

    //writes the temperature in C
    public void writeC(){
        System.out.println("Temperature = " + convertTemp(degree,type,'C') + " degrees C.");        
    }

    // writes the temperature in F
    public void writeF(){
        System.out.println("Temperature = " + convertTemp(degree,type,'F') + " degrees F.");        
    }

    //returns the temperature in C
    public double getC(){
        return convertTemp(degree,type,'C');
    }

    //returns the temperature in F
    public double getF(){
        return convertTemp(degree,type,'F');
    }
}
