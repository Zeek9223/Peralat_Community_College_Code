package project2;
/*
@ Ana
*/

import java.util.ArrayList;
import java.util.List;

public class WalkObserver implements RandomWalkObserver{

	private List<Integer> distance = new ArrayList<Integer>();
	
	public WalkObserver() {
		for(int i = 1; i < 6; i++){
			distance.add(i*5);
		}
	}
	
	@Override
	public void moved(RandomWalkEvent randomWalkEvent) {
		if(distance.contains(Math.abs(randomWalkEvent.
                        getRandomWalker().getDistance()))){
			System.out.println("Direction of movement �� " + 
                                randomWalkEvent.getDirection()
								+ 
                                " Moving distance: "
								+ 
                                Math.abs(randomWalkEvent.getRandomWalker().
                                        getDistance())
								+ 
                                " Move steps : "
								+ 
                                randomWalkEvent.getRandomWalker().
                                        getStepCount());
		}
	}
}
