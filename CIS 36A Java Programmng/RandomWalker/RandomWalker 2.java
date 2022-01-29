package project2;
/*

* @Ana
*/
import java.util.ArrayList;
import java.util.List;

public class RandomWalker implements Observerable{
	
	private List<RandomWalkObserver> observerList;
	/**
	 *
	 */
	private Direction direction;
	/**
	 *
	 */
	private int distance;
	/**
	 *
	 */
	private int stepCount;
	/**
	 *
	 */
	private RandomWalkEvent randomWalkerEvent;

	public RandomWalker() {
		observerList = new ArrayList<RandomWalkObserver>();
		randomWalkerEvent = new RandomWalkEvent(this);
	}
	
	@Override
	public void registerObserver(RandomWalkObserver randomWalkObserver) {
		observerList.add(randomWalkObserver);
	}

	@Override
	public void removeObserver(RandomWalkObserver randomWalkObserver) {
		if(!observerList.isEmpty()){
			observerList.remove(randomWalkObserver);
		}
	}
	
	public void randomWalk(){	
		//
		while(true){
			int d = (int) (Math.random() * 2);
			if(d == 1){
				direction = Direction.left;
			}
			else{
				direction = Direction.right;
			}
			int step = (direction == Direction.right) ? 1 : -1;
			distance += step;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			stepCount++;
			randomWalkerEvent.setDirection(direction);
			notifyObserver();
		}
	}
	@Override
	public void notifyObserver() {
		for(int i = 0; i < observerList.size(); i++){
			(observerList.get(i)).moved(randomWalkerEvent);
		}
	}
	public int getDistance(){
		return distance;
	}
	public int getStepCount(){
		return stepCount;
	}
}