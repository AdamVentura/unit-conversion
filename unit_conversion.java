/*
 * Adam Ventura
 * 2/26/2021
 * This program allows users to convert from the following conversions:
 * feet to inches, centimeters to inches, miles to meters, miles to feet, pounds to ounces, and kilowatts to horsepower.
 */

package unit_conversion;

import java.util.Scanner;

public class unit_conversion {

	public static void main(String[] args) {
		// Create instance of input reader
		Scanner reader = new Scanner(System.in);
		
		// Create instance of class
		unit_conversion uc = new unit_conversion();
		
		// Declare variables
		double dType, dFeet, dCentimeters, dMiles, dPounds, dKilowatts;
		
		// Prompt user for type of conversion
		System.out.println("What units would you like to convert (Enter one of the following numbers)?");
		System.out.println("(1) Feet to inches.");
		System.out.println("(2) Centimeters to inches.");
		System.out.println("(3) Miles to meters.");
		System.out.println("(4) Miles to feet.");
		System.out.println("(5) Pounds to ounces.");
		System.out.println("(6) Kilowatts to horsepower.");
		
		// Store answer in variable iType
		dType = reader.nextInt();
		
		
		// Use if statements to determine what method to use then call conversion method and print method
		if (dType == 1) 
		{
			System.out.println("Enter the amount of feet: ");
			dFeet = reader.nextInt();
			double dInches = uc.Ft2In(dFeet);
			uc.PrintFt2In(dFeet, dInches);
		}
		
		if (dType == 2) 
		{
			System.out.println("Enter the amount of centimeters: ");
			dCentimeters = reader.nextInt();
			double dInches = uc.Cen2In(dCentimeters);
			uc.PrintCen2In(dCentimeters, dInches);
		}
		
		if (dType == 3) 
		{
			System.out.println("Enter the amount of miles: ");
			dMiles = reader.nextInt();
			double dMeters = uc.Miles2M(dMiles);
			uc.PrintMiles2M(dMiles, dMeters);
		}
		
		if (dType == 4) 
		{
			System.out.println("Enter the amount of miles: ");
			dMiles = reader.nextInt();
			double dFeet2 = uc.Miles2Ft(dMiles);
			uc.PrintMiles2Ft(dMiles, dFeet2);
		}
		
		if (dType == 5) 
		{
			System.out.println("Enter the amount of pounds: ");
			dPounds = reader.nextInt();
			double dOunces = uc.lbs2oz(dPounds);
			uc.Printlbs2oz(dPounds, dOunces);
			
		}
		
		if (dType == 6) 
		{
			System.out.println("Enter the amount of kilowatts: ");
			dKilowatts = reader.nextInt();
			double dHorsepower = uc.Kw2Hp(dKilowatts);
			uc.PrintKw2Hp(dKilowatts, dHorsepower);
		}
	}
		
		
	// This method converts from feet to inches
	public double Ft2In(double dFeet) 
	{
		double dInches;
		dInches = dFeet * 12.0;
		return dInches;
	}
	
	// This method prints the conversion of feet to inches
	public void PrintFt2In(double dFeet, double dInches) 
	{
		System.out.println(dFeet + " feet is equal to " + dInches + " inches.");
	}
	
	// This method converts from centimeters to inches
	public double Cen2In(double dCentimeters) 
	{
		double dInches;
		dInches = dCentimeters / 2.54;
		return dInches;
	}
	
	// This method prints the conversion of feet to inches
	public void PrintCen2In(double dCentimeters, double dInches) 
	{
		System.out.println(dCentimeters + " centimeters is equal to " + dInches + " inches.");
	}
	
	// This method converts miles to meters
	public double Miles2M(double dMiles) 
	{
		double dMeters;
		dMeters = dMiles * 1609.34;
		return dMeters;
	}
	
	// This method prints out the conversion of miles to meters
	public void PrintMiles2M(double dMiles, double dMeters) 
	{
		System.out.println(dMiles + " miles is equal to " + dMeters + " meters.");
	}
	
	// This method converts miles to feet
	public double Miles2Ft(double dMiles) 
	{
		double dFeet;
		dFeet = dMiles * 5280.0;
		return dFeet;
	}
	
	// This method prints out the conversion of miles to feet
	public void PrintMiles2Ft(double dMiles, double dFeet) 
	{
		System.out.println(dMiles + " miles is equal to " + dFeet + " feet.");
	}
	
	// This method converts pounds to ounces
	public double lbs2oz(double dPounds) 
	{
		double dOunces;
		dOunces = dPounds * 16.0;
		return dOunces;
	}
	
	// This method prints out the conversion of pounds to ounces
	public void Printlbs2oz(double dPounds, double dOunces) 
	{
		System.out.println(dPounds + " pounds is equal to " + dOunces + " ounces.");
	}
	
	// This method converts from kilowatts to horsepower
	public double Kw2Hp(double dKilowatts) 
	{
		double dHorsepower;
		dHorsepower = dKilowatts * 1.341003;
		return dHorsepower;
	}
	
	// This method prints out the conversion of kilowatts to horsepower
	public void PrintKw2Hp(double dKilowatts, double dHorsepower)
	{
		System.out.println(dKilowatts + " kilowatts is equal to " + dHorsepower + " horsepower.");
	}
	
	
}