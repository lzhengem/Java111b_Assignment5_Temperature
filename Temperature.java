
import java.util.Scanner;

public class Temperature {
double degree;
char type;

// to specify both parameters (degrees, type)
public Temperature(double degree, char type){
    this.degree = degree;
    this.type = type;
    
}

//to specify just the degrees (defaults to type Celsius)
public Temperature(double degree){
    this.degree= degree;
    this.type ='C';
   
}

//to specify just the type (defaults to 0.0 for the degrees value)
public Temperature(char type){
    this.type = type;
    this.degree = 0.0;
}

// the default constructor that specifies neither (defaults to 0 degrees Celsius)
public Temperature(){
    this.type ='C';
    this.degree= 0;
}  

//prompt user for degrees and type and then reads the values
public void ReadInPut(){
    Scanner input = new Scanner(System.in);
    this.degree = input.nextDouble();
    this.type = (char) input.nextShort();
}

}