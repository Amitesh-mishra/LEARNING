import java.util.Scanner;

public class JourneyCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER A SPEED AND DISTANCE");
		double speed = scan.nextDouble();
		double time= scan.nextDouble();
		JourneyCalculator journeycalculator=new JourneyCalculator();
		
		System.out.println(journeycalculator.calculateDistance(speed, time));

	}

}
