package justiceLeague;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		OuterSpace space = new OuterSpace();
		Batman batman = new Batman();
		Superman superman = new Superman();
		ArrayList<Meteor> meteorList = batman.getMeteorsInSpace(space);
		
		System.out.println(space.countMeteors());
		
		superman.destroyMeteorsInSpace(meteorList, space);
				
		System.out.println(space.countMeteors());
		System.out.println("Reached the end!");
	
	}

}
