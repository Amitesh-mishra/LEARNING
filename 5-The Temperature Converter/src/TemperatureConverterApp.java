import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER A fahrenheit NUMBER");
		double fahrenheit=scan.nextDouble();
		TemperatureConverter temperatureconverter=new TemperatureConverter();
		System.out.println(temperatureconverter.convertFahrenheitToCelsius(fahrenheit));
		
		

	}

}
