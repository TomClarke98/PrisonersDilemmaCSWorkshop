package tournament;

import java.util.ArrayList;

/** Prisoner's Dilemma Techniques/Strategies
 * 
 * This class aggregates all of the different strategies.
 * 
 * **********************
 * Make sure you add your strategy here if you want it
 * to run in the tournament. Follow the format below
 * for adding strategies.
 * **********************
 * 
 * @author Connor Ford
 * @version 10/17
 *
 */

public class PrisonerDilemmaTechniques {

	public ArrayList<Strategy> strategies = new ArrayList<Strategy>();
	
	//Declare strategies
	/*DECALRE YOUR STRATEGY HERE*/
	private BubbleStategy bubbleStategy = new BubbleStategy();
	private BurstStategy burstStategy = new BurstStategy();
	
	
	public PrisonerDilemmaTechniques() {
		/*ADD YOUR STRATEGY HERE*/
		strategies.add(bubbleStategy);
		strategies.add(burstStategy);
	}


}