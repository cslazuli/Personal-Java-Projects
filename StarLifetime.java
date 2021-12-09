import java.util.Scanner;

public class StarLifetime {
	
	public static void main(String[] args) {
		final double solarMass = (2 * Math.pow(10, 30));
		final double solarLifetime = Math.pow(10, 10); 
		
		int stopVar = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		while (stopVar == 0) {
			
		//User enters mass of star in question (in solar masses)
			System.out.println("Enter the mass of a main-sequence star (in solar masses) whose lifetime you want to determine.");
			double stellarSolarMasses = keyboard.nextDouble();
			keyboard.nextLine();
			
				if (stellarSolarMasses <= 0.5) {
					System.out.println("Main-Sequence Star must be greater than 0.5 solar masses.");
				}
				
				else {
				
				//Calculation of that star's lifetime	
					double stellarMass = stellarSolarMasses * solarMass;
					
					double stellarLifetime = solarLifetime * Math.pow((stellarMass / solarMass), -2.5);
					
					//Output if user enters the sun's mass (1 solar mass)
						if (stellarSolarMasses == 1) {
							System.out.printf("The sun will live for about %3.1e", stellarLifetime);
							System.out.println(" years.");
						} 
						
					//Output of the star's lifetime
						else {
							System.out.printf("This star will live for about %3.1e", stellarLifetime);
							System.out.println(" years.");
						}
				}
		
		//Calculate another star or quit program query.
			System.out.println("Calculate another stellar lifetime? (Enter yes/no)");
			String calculateAnother = keyboard.nextLine();
			
				if (calculateAnother.equalsIgnoreCase("no")) {
					System.out.println("Happy stargazing! Goodbye.");
					stopVar++;
				}
			
		}
		
	keyboard.close();
	}

}
