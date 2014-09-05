/////////////////////////////////////////////////////////////////////////////
//Yanxing Yang
//Cyclometer Java Program
// first compile the program
// javac Cyclometer java
//run the program
// java Cyclometer//

//define a class
public class Cyclometer {
    //main method required for every Java program
    public static void main(String[] args){
     // our input data.
     int secsTrip1=480;    //print the number of minutes for trip1
     int secsTrip2=3220;   //print the number of minutes for trip2
     int countsTrip1=1561; //print the number of counts for trip1
     int countsTrip2=9037; //print the number of counts for trip2
     double wheelDiameter=27.0, //define the diameter of the wheel
     PI=3.14159, //define the constant pi as such
     feetPerMile=5280, //define the conversion between feet and mile
     inchesPerFoot=12, //define the conversion between inches and foot
     secondsPerMinute=60; //define the conversion between secs and mins
     double distanceTrip1, distanceTrip2, totalDistance; //define distances
     
    System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
    System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
    
    //run the calculations; store the values. Here we calculate the time of trips in mins and the the distance in miles
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    //above gives distance in inches
    //(for each count, a rotation of the wheel travels the diameter in inches times PI)
    distanceTrip1/=inchesPerFoot*feetPerMile;//GIves distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
    //print out the output data.
    
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
    
        
        
    }//end of main method 
}//end of class