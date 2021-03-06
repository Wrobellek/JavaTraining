import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {

		double weight;
		double height;
		double bmi;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your weight in kilograms: ");
		weight = input.nextDouble();
		
		System.out.println("Enter your height in meters (e.g. 1,82):  ");
		height = input.nextDouble();
		
        //BMI caluculation
		bmi = weight / (height * height);

        //display output
		System.out.format("Your Body Mass Index is: %.2f\nand means ", bmi);
		
        //interpret BMI
		if (bmi<16.0) {
			System.out.println("VERY SEVERELY UNDERWEIGHT");
		}	
			else if (16.0<=bmi && bmi<17.0) {
				System.out.println("SEVERELY UNDERWEIGHT");
			}
			else if (17.0<=bmi && bmi<18.5) {
				System.out.println("UNDERWEIGHT");
			}
			else if (18.5<=bmi && bmi<25.0) {
				System.out.println("NORMAL - HEALTHY WEIGHT");
			}
			else if (25.0<=bmi && bmi<30.0) {
				System.out.println("OVERWEIGHT");
			}
			else if (30.0<=bmi && bmi<35.0) {
				System.out.println("OBESE CLASS I (MODERATELY OBESE)");
			}
			else if (35.0<=bmi && bmi<40.0) {
				System.out.println("OBESE CLASS II (SEVERELY OBESE)");
			}
			else if (40.0<=bmi) {
				System.out.println("OBESE CLASS III (VERY SEVERELY OBESE)");
			}
		
	}
}