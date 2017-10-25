/**
    * Temperature class represents a temperature
    * class contains 4 counstructors and private function convertTemp
    * methods include: readInput, writeOutput, writeC, writeF, 
    *    getC, getF, set, to_String, equals 
    *@author(s) Chien Lin, Lena Zheng, Qian dong Li
    *@version 1.3
    *@since 2017-10-24
*/

import java.util.Scanner;
import java.text.DecimalFormat;


public class Temperature {
    double degree;
    char type;


    //creating a scanner for user input
    Scanner input = new Scanner(System.in);
    DecimalFormat oneDecimal = new DecimalFormat("###,##0.0");
    
    // to specify both parameters (degrees, type)
    public Temperature(double p_degree, char p_type){
        degree = p_degree;
        type = p_type;
    }

    //to specify just the degrees (defaults to type Celsius)
    public Temperature(double p_degree){
        degree = p_degree;
        type = 'C';
    }

    //to specify just the type (defaults to 0.0 for the degrees value)
    public Temperature(char p_type){
        type = p_type;
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
        System.out.println("Temperature = " + oneDecimal.format(degree) + " degrees "+ type + ".");
    }

    //writes the temperature in C
    public void writeC(){
        System.out.println("Temperature = " + oneDecimal.format(convertTemp(degree,type,'C')) + " degrees C.");        
    }

    // writes the temperature in F
    public void writeF(){
        System.out.println("Temperature = " + oneDecimal.format(convertTemp(degree,type,'F')) + " degrees F.");        
    }

    //returns the temperature in C
    public double getC(){
        return Math.round(convertTemp(degree,type,'C')*10)/10.0;
    }

    //returns the temperature in F
    public double getF(){
        return Math.round(convertTemp(degree,type,'F')*10)/10.0;
    }

    
        // set overload method
    public void set(double p_deg){
        degree = p_deg;  
    }
  
    public void set(char p_type){
        type = p_type;  
    }

    public void set(double p_deg, char p_type){
        degree = p_deg;  
        type = p_type;  
    }

    //comparison method.
    public boolean equals(Temperature otherTemp){
        Boolean return_val = false;
        if(getC() == otherTemp.getC()){
            return_val = true;
        }
        return return_val;
    }

    public String toString(){
        String result = "Temperature is set to ";

        if (Character.toUpperCase(type) == 'C'){
            result = result + degree + " " + type + " or " + getF() + " F.";
        } else {result = result + degree + " " + type + " or " + getC() + " C."; 
        }
    
        return result;
    };

}
