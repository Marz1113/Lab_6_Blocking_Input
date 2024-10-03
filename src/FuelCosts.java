import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double gallons = 0;
        double fuelEff = 0;
        double PPG = 0;

        do {
            System.out.print("enter the number of gallons that you have in the tank: ");
            gallons = in.nextDouble();
            if (gallons <= 0) {
                System.out.println("enter a positive value");
            }
        } while (gallons <= 0);

        do {
            System.out.print("enter your fuel efficiency in miles per gallon: ");
            fuelEff = in.nextDouble();
            if (fuelEff <= 0) {
                System.out.println("enter a positive value");

            }
        } while (fuelEff <= 0);

        do {
            System.out.print("what is the price of gas per gallon: ");
            PPG = in.nextDouble();
            if (PPG <= 0) {
                System.out.println("enter a positive value");
            }
        } while (PPG <= 0);

        double cost100Miles = (100 / fuelEff) * PPG;
        double fullTankDistance = gallons * fuelEff;

        System.out.printf("the cost to go 100 miles is: $%.2f%n", cost100Miles);
        System.out.printf("your car is able to go %.2f miles on a full tank.%n", fullTankDistance);
    }
}
