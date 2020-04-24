package testJusticeLeague;

import justiceLeague.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class TestJusticeLeague {

	@Test
	void testCountMeteorsOfOuterSpace() {
		OuterSpace space = new OuterSpace();
		Meteor[][] spaceGrid = space.getSpaceGrid();
		int meteorCount = 0;
		int result = space.countMeteors();
		for(int i = 0; i < spaceGrid.length; i++) {
			for(int j = 0; j < spaceGrid.length; j++) {
				if(spaceGrid[i][j] != null) {
					meteorCount++;
				}
			}
		}
		
		assertEquals(meteorCount, result);
	}
	
	@Test
	void testGetMeteorsOfBatman() {
		ArrayList<Meteor> meteorList = new ArrayList<Meteor>();
		OuterSpace space = new OuterSpace();
		Batman batman = new Batman();
		
		meteorList = batman.getMeteorsInSpace(space);
		
		assertEquals(meteorList.size(), space.countMeteors());
	}
	
	@Test
	void testDestroyMeteorOfSuperman() {
		OuterSpace space = new OuterSpace();
		Batman batman = new Batman();
		Superman superman = new Superman();
		ArrayList<Meteor> meteorList = batman.getMeteorsInSpace(space);
		
		superman.destroyMeteorsInSpace(meteorList, space);
		
		assertEquals(0, space.countMeteors());
	}

}
