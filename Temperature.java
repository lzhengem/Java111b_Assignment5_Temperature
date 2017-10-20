
import java.util.Scanner;






public class Temperature {
    double degree;
        char type;

           


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
           
            
           Scanner input = new Scanner(System.in);
                
           
            System.out.println("Enter a temperature in degress ");
                
               degree = input.nextDouble();
    
                                  
                System.out.println("Enter 'F' (or 'f') for Fahrenheit or 'C' (or 'c') for Celsius:");
                
                //convert user input to a char
                char type[]=input.next().toCharArray();
             
                  System.out.print("Temperature =" + " " + degree + String.valueOf(type));
                }   

        
}