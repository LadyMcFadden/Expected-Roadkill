/*
     This program is intended to find the expected number of roadkill each year.
	 This will be done for square parcels of land, each of which has roads of known length running through.
*/

import java.util.Scanner;

public class ExpectedRoadkill
{
	public static void main (String[] args)
	{
		double numOfAnimals;		//To hold number of animals
		double sideOfSquare;		//To hold side of square
		double lengthOfRoads;		//To hold length of roads
		double widthOfRoads = 0.01;	//To hold the width of the roads
		double area;				//To hold area
		double animalDensity;		//To hold the animal density
		double roadSurfaceArea;		//To hold the road surface area
		double expectedNumOfKills;	//To hold expected number of kills
		final double ROADKILL_PROBABILITY = 1.47;		//To hold the constant roadkill probability value
		
		//Create a Scanner object for the keyboard input.
		Scanner keyboard = new Scanner (System.in);
		
		//Get the side of square land, length of roads and number of animals from the keyboard buffer.
		System.out.print("Enter side of square in km :");
		sideOfSquare = keyboard.nextDouble();
		System.out.print("Enter roads length in km :");
		lengthOfRoads = keyboard.nextDouble();
		System.out.print("Enter number of animals :");
		numOfAnimals = keyboard.nextInt();
		
		
		//Calcute the area
		area =  sideOfSquare * sideOfSquare;
		
		//Calculate the road surface area
		roadSurfaceArea = lengthOfRoads * widthOfRoads;
		
		//Calculate the animal density
		animalDensity = numOfAnimals / area;
		
		//Calculate expectedNumOfKills
		expectedNumOfKills = animalDensity * roadSurfaceArea * ROADKILL_PROBABILITY;
		
		//Output the expected number of kills.
		System.out.println("Expected number of kills is :" + expectedNumOfKills);
	}
}