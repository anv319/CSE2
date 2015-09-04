// Anthony Varshavskiy
// 09/04/15
// CSE2-111
// Cyclometer Program

// define a class for Cyclometer
public class Cyclometer {
    // main method required for every Java program
    public static void main(String[] args) {
        int secsTrip1=480;  // Time elapsed for Trip 1
       	int secsTrip2=3220;  // Time elapsed for Trip 2
		int countsTrip1=1561;  // Number of rotations for Trip 1
		int countsTrip2=9037; // Number of rotations for Trip 2
		double wheelDiameter=27.0,  // Set the wheel to be 27 inches
  	PI=3.14159, // Value for the irrational number pi
  	feetPerMile=5280,  // Value for # of feet per mile
  	inchesPerFoot=12,   // Value for # of inches per foot
  	secondsPerMinute=60;  // Value for # of seconds per minute
	double distanceTrip1, distanceTrip2,totalDistance;  // Set these 3 variables as decimal values
	// Print time and # of counts of Trip 1
	System.out.println("Trip 1 took "+
       	(secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts.");
    // Print time and # of counts for Trip 2
	System.out.println("Trip 2 took "+
       	(secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");
    // run the calculations; store the values
		// Formula for finding distance of Trip 1
	distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
	distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
		// Formula for finding distance of Trip 2
	distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
		// Equation for finding the total distance
	totalDistance=distanceTrip1+distanceTrip2;
	//Print out the output data.
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
	System.out.println("Trip 2 was "+distanceTrip2+" miles");
	System.out.println("The total distance was "+totalDistance+" miles");
    }   // end of main method
}   // end of class
