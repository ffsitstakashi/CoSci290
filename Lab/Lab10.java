/* 
  Thomas Mak
  03/20/2018
  Co Sci 290
  Lab 10 - Conversions between Celsius and Fahrenheit
*/

public class Lab10{
	// Creating method and converting Celsius to Fahrenheit
	public static double celciusToFahrenheit(double celcius) {
		double fahrenheit = (9.0 / 5) * celcius + 32;
		return (int) fahrenheit;
	}
	
	// Creating method and converting Fahrenheit to Celsius
	public static double fahrenheitToCelcius(double fahrenheit) {
  	double celcius = (5.0 / 9) * (fahrenheit - 32);
    return (int) celcius;
	}

		public static void main(String[] args) {
    
 		// Display table 
    System.out.println("Celcius\tFahrenheit\t|\tFahrenheit\tCelcius");
    for (int i = 0; i < 10; i++ ) {
        System.out.print((40-i) + "\t" + celciusToFahrenheit((40-i)) + 
												 "\t|\t");
 
        System.out.print((120 - (i * 10)) + "\t" + fahrenheitToCelcius((120 - (i * 10))) + 
												 "\n");
    }
	}
}

  
  
 
  