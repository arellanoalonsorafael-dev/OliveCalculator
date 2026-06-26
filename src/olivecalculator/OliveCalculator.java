
package olivecalculator;

import java.util.Scanner;

/**
 * Olive Harvest Wage Calculator
 * @author Rafael Arellano Alonso
 */
public class OliveCalculator {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INITIAL CONFIGURATION");
        
        // 1. Initial dynamic variable insertion
        System.out.print("Enter the price of olives per kg (e.g., 0.30): ");
        double olivePrice = scanner.nextDouble();

        System.out.print("Enter the number of tanks to calculate: ");
        int numTanks = scanner.nextInt();

        System.out.print("Enter the number of working days per tank: ");
        int numDays = scanner.nextInt();

        System.out.print("Enter the number of workers (crew size): ");
        int numWorkers = scanner.nextInt();

        // Arrays to store data dynamically based on user input
        double[] tankWeights = new double[numTanks];
        double[][] sacksPerDay = new double[numTanks][numDays];

        // 2. Data collection using loops
        for (int i = 0; i < numTanks; i++) {
            System.out.println("\n--- Data for TANK " + (i + 1) + " ---");
            System.out.print("Enter the amount of olives in tank " + (i + 1) + " (kg): ");
            tankWeights[i] = scanner.nextDouble();

            for (int j = 0; j < numDays; j++) {
                System.out.print("Day " + (j + 1) + " - Enter the number of sacks collected: ");
                sacksPerDay[i][j] = scanner.nextDouble();
                
                // Note: If workers varied each day, you would ask for the variable here:
                // workersPerDay[i][j] = scanner.nextInt();
            }
        }

        // 3. Clean calculations and data output
        System.out.println("\n================ RESULTS ================");
        
        for (int i = 0; i < numTanks; i++) {
            double totalSacks = 0;
            
            // Sum the total sacks for the current tank
            for (int j = 0; j < numDays; j++) {
                totalSacks += sacksPerDay[i][j];
            }

            // Mathematical formulas
            double tankEarnings = tankWeights[i] * olivePrice;
            // Prevent division by zero if no sacks were entered
            double pricePerSack = (totalSacks > 0) ? (tankEarnings / totalSacks) : 0; 

            System.out.printf("\n--- RESULTS TANK %d ---\n", (i + 1));
            
            // Calculate and display the wage day by day
            for (int j = 0; j < numDays; j++) {
                double dailyWage = 0;
                if (numWorkers > 0) {
                    dailyWage = (pricePerSack * sacksPerDay[i][j]) / numWorkers;
                }
                System.out.printf("The wage for a worker on day %d is: %,.2f €\n", (j + 1), dailyWage);
            }
            
            // General results for the tank
            System.out.printf("The earnings per sack for tank %d is: %,.2f €\n", (i + 1), pricePerSack);
            System.out.printf("The total earnings for tank %d is: %,.2f €\n", (i + 1), tankEarnings);
        }

        scanner.close();
    }
}