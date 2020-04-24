package testJusticeLeague;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import justiceLeague.*;
import java.util.ArrayList;

class JusticeLeagueTest {

	@Test
	void testCountMeteorsOfOuterSpace() {
		OuterSpace space = new OuterSpace();
		Meteor[][] spaceGridTest = space.getSpaceGrid();
		int result = space.countMeteors();
		int meteorCount = 0;
		
		for(int i = 0; i < spaceGridTest.length; i ++) {
			for(int j = 0; j < spaceGridTest.length; j ++) {
				if(space.getObjectAtCoords(i, j) != null) {
					meteorCount++;
				}
			}
		}
		
		assertEquals(meteorCount, result);
	}
	
	@Test
	void testGetMeteorsOfBatman() {
		OuterSpace space = new OuterSpace();
		Batman batman = new Batman();
		ArrayList<Meteor> meteorList = batman.getMeteorsInSpace(space);
		
		assertEquals(meteorList.size(), space.countMeteors());
	}
	
	@Test
	void testDestroyMeteorsOfSuperman() {
		OuterSpace space = new OuterSpace();
		Batman batman = new Batman();
		Superman superman = new Superman();
		ArrayList<Meteor> meteorList = batman.getMeteorsInSpace(space);
		
		superman.destroyMeteorsInSpace(meteorList, space);
		
		assertEquals(0, space.countMeteors());
	}
	

}
