import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store accident data
        String[] cities = {"Cape Town", "Johannesburg", "Port Elizabeth"};
        int[][] accidents = new int[3][2];
        int[] totalAccidentsPerCity = new int[3];

        // Input accident data
        for (int i = 0; i < cities.length; i++) {
            System.out.println("Enter the number of car accidents for " + cities[i] + ": ");
            accidents[i][0] = scanner.nextInt(); // Car accidents

            System.out.println("Enter the number of motor bike accidents for " + cities[i] + ": ");
            accidents[i][1] = scanner.nextInt(); // Motorbike accidents
        }

        // Calculate total accidents per city
        for (int i = 0; i < cities.length; i++) {
            totalAccidentsPerCity[i] = accidents[i][0] + accidents[i][1]; // Total accidents for each city
        }

        // Generate road accident report
        System.out.println("\nROAD ACCIDENT REPORT");
        System.out.printf("%-15s %-10s %-10s\n", "City", "Car", "Motor Bike");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-15s %-10d %-10d\n", cities[i], accidents[i][0], accidents[i][1]);
        }

        // Display total accidents per city
        System.out.println("\nROAD ACCIDENT TOTALS FOR EACH CITY");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-15s %-10d\n", cities[i], totalAccidentsPerCity[i]);
        }

        // Find the city with the highest number of accidents
        int maxAccidents = totalAccidentsPerCity[0];
        String cityWithMostAccidents = cities[0];
        for (int i = 1; i < totalAccidentsPerCity.length; i++) {
            if (totalAccidentsPerCity[i] > maxAccidents) {
                maxAccidents = totalAccidentsPerCity[i];
                cityWithMostAccidents = cities[i];
            }
        }

        System.out.println("\nCITY WITH THE MOST VEHICLE ACCIDENTS: " + cityWithMostAccidents);
    }
}