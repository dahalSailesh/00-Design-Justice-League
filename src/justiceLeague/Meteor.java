package justiceLeague;

import java.util.Random;

public class Meteor implements Comparable<Meteor>{

	private double distanceToEarth;
	private int xPos;
	private int yPos;
	
	// Constructor	
	public Meteor(double distanceToEarth) {
		this.distanceToEarth = distanceToEarth;
		this.xPos = this.generateRandomInt();
		this.yPos = this.generateRandomInt();
	}
	
	// Global Variables	
	private Random rand = new Random();
	
	
	public double getDistanceToEarth() {
		return this.distanceToEarth;
	}
	
	public int xPos() {
		return this.xPos;
	}
	
	public int yPos() {
		return this.yPos;
	}
	
	
	private int generateRandomInt() {
		return rand.nextInt(100);
	}

	@Override
	public int compareTo(Meteor m) {
		if(this.distanceToEarth < m.distanceToEarth) {
			return 1;
		}
		else if (this.distanceToEarth > m.distanceToEarth) {
			return -1;
		}
		return 0; 	
	}
	
		
}
