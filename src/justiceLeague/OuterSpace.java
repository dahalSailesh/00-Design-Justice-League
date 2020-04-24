package justiceLeague;

import java.text.DecimalFormat;
import java.util.Random;

public class OuterSpace {
	private Meteor[][] spaceGrid;
	
	// Constructor	
	public OuterSpace() {
		this.spaceGrid = new Meteor[100][100];
		this.generateMeteors();
	}
	
	// Global Variables
	private Random rand = new Random();
	private int numOfMeteors;
	
	
	
	public int getSize() {
		return 100;
	}
	
	public Meteor getObjectAtCoords(int x, int y) {
		return this.spaceGrid[x][y];
	}
	
	public Meteor[][] getSpaceGrid(){
		return this.spaceGrid;
	}
	
	public int countMeteors() {
		numOfMeteors = 0;
		for(int i = 0; i < this.spaceGrid.length; i++) {
			for(int j = 0; j < this.spaceGrid.length; j++) {
				if(this.spaceGrid[i][j] != null) {
					numOfMeteors++;
				}
			}
		}
		
		return numOfMeteors;
	}
	
	private void generateMeteors() {
		int numToGenerate = rand.nextInt(101);
		
		while(numToGenerate > 0) {
			double randomDist = this.generateRandomDouble();
			Meteor newMeteor = new Meteor(randomDist);
			int xPos = newMeteor.xPos();
			int yPos = newMeteor.yPos();
			
			if(getObjectAtCoords(xPos, yPos) == null) {
				spaceGrid[xPos][yPos] = newMeteor;
				numToGenerate--;
			}
		}
	}
	
	private double generateRandomDouble() {
		double d = rand.nextInt(10000000) + 10000 + rand.nextDouble();
		DecimalFormat df = new DecimalFormat("#.##");
		String dd = df.format(d);
		
		return Double.parseDouble(dd);
	}

}
