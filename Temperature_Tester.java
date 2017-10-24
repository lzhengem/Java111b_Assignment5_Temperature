public class Temperature_Tester {
  
    public static void main(String[] args){
    // testing for part 1.
    // testing writeOutput method

    System.out.println("\n--------------------Testing part 1-------------------");
        Temperature myTemp = new Temperature(40.0, 'F');
        System.out.println("Testing writeOutput at 40 degrees F");
        myTemp.writeOutput();
        Temperature myTemp2 = new Temperature(20.0);
        System.out.println("Testing writeOutput at 20 degrees C");
        myTemp2.writeOutput();
        Temperature myTemp3 = new Temperature('F');
        System.out.println("Testing writeOutput at 0 degrees F");
        myTemp3.writeOutput();
        Temperature myTemp4 = new Temperature();
        System.out.println("Testing writeOutput at 0 degrees C");
        myTemp4.writeOutput();
        System.out.println("");
        System.out.println("readInput with writeOutput");
        myTemp4.readInput();

   // testing for part 2.
    System.out.println("\n--------------------Testing part 2-------------------");
    myTemp4.writeOutput();
    myTemp4.writeC();
    myTemp4.writeF();
    
    System.out.println("\nTesting getC() method");
    System.out.println(myTemp4.getC());
    
    
    System.out.println("\nTesting getF() method");
    System.out.println(myTemp4.getF());
    
    // testing for part 3.
/*    System.out.println("\n--------------------Testing part 3-------------------");
    myTemp3.writeOutput();
     System.out.println("Testing set overload method");
    myTemp3.set(20.0);
    System.out.println("Set Temperature to 20.0");
    myTemp3.writeOutput();
    myTemp3.set('C');
    System.out.println("Set type to 'C'");
    myTemp3.writeOutput();
    myTemp3.set(32.0, 'F');
    System.out.println("Set temp to 32.0 and type to 'F'");
    myTemp3.writeOutput();
    
    System.out.println("\nTest if two temperature objects are equal");
        System.out.print("First temperature is:     "); 
        myTemp4.writeOutput();
        System.out.print("Second temperature is:    ");
        myTemp3.writeOutput();
        System.out.println("The two temperatures are equal is " + myTemp4.equals(myTemp3));
        
        System.out.println("\n" + myTemp5.toString()); */
    
    }

}
