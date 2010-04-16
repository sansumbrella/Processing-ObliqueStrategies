package com.sansumbrella;

import java.util.ArrayList;

import processing.core.PApplet;

public class StrategyList extends PApplet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<String> shuffledStrategies;
	private int currentIndex;
	
	StrategyList(){
		shuffledStrategies = new ArrayList<String>();
		
		for(String s : strategies){
			shuffledStrategies.add(s);
		}
		shuffleStrategies();
		currentIndex = 0;
	}
	
	/**
	 * Returns the next strategy in the shuffled list
	 * @return
	 */
	public String nextStrategy()
	{
		if( currentIndex >= shuffledStrategies.size() ){
			currentIndex = 0;
			shuffleStrategies();
		}
		return shuffledStrategies.get(currentIndex++); 
	}
	
	private void shuffleStrategies()
	{
		ArrayList<String> temp = new ArrayList<String>();
		for(int i=shuffledStrategies.size()-1; i>=0; i--){
			temp.add( shuffledStrategies.remove( floor(random(shuffledStrategies.size()-0.01f)) ) );
		}
		
		shuffledStrategies = temp;
	}
	
	private String[] strategies = { 
			//From David
			"Turn it over.",
			"Switch the axes.",
			"Think about color.",
			"Make it black and white.",
			"Use the tangents.",
			"Move across the room.",
			"Restart.",
			"Make it ridiculous.",
			"Stop making sense.",
			"Emphasize the side effects.",
			"Turn it into a game.",
			"More semicolons.",
			"A => AB, B => B.",
			"Apply the Sieve of Eratosthenes.",
			"0,1,1 => 0,0,0.",
			"1,0,1 => 0,1,0.",
			//with Chandler
			"Maybe you should use %",
			"Block, Beehive, Loaf, Boat.",
			"Blinker, Toad, Beacon, Pulsar.",
			"Glider, LWSS.",
			"The R pentomino.",
			"Make the model the view.",
			"Change your controller.",
			//From original
			"Try faking it.",
			"State the problem in words as clearly as possible.",
			"Only one element of each kind.",
			"What would your closest friend do?",
			"What to increase? What to reduce?",
			"Are there sections? Consider transitions.",
			//from Casey
			"Don't think. Do.",
			"But, does it float?",
			"Remove half.",
			"0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597...",
			"3.1415926535897932384626433832795028...",
			"Double the main element.",
			//from original deck (Brian Eno)
			"Abandon normal instruments.",
			"Accept advice.",
			"Accretion.",
			"A line has two sides.",
			"Balance the consistency principle with the inconsistency principle.",
			"Be dirty.",
			"Breathe more deeply.",
			"Bridges -build -burn.",
			"Cascades.",
			"Cluster analysis.",
			"Consider different fading systems.",
			"Courage!",
			"Cut a vital connection.",
			"Decorate, decorate.",
			"Define an area as 'safe' and use it as an anchor.",
			"Destroy the most important thing.",
			"Discard an axiom.",
			"Disconnect from desire.",
			"Discover the recipes you are using and abandon them.",
			"Distorting time.",
			"Don't be afraid of things because they're easy to do.",
			"Don't be frightened of cliches.",
			"Don't be frightened to display your talents.",
			"Don't stress one thing more than another.",
			"Do something boring.",
			"Do the washing up.",
			"Do the words need changing?",
			"Do we need holes?",
			"Emphasize differences.",
			"Emphasize repetitions.",
			"Emphasize the flaws.",
			"Get your neck massaged.",
			"Give way to your worst impulse.",
			"Go slowly all the way round the outside.",
			"Honor thy error as a hidden intention.",
			"How would you have done it?",
			"Humanize something free of error.",
			"Infinitesimal gradations.",
			"Into the impossible.",
			"Is it finished?",
			"Is there something missing?",
			"Just carry on.",
			"Left channel, right channel, centre channel.",
			"Look at a very small object, look at its centre.",
			"Look at the order in which you do things.",
			"Look closely at the most embarrassing details and amplify them.",
			"Make a blank valuable by putting it in an exquisite frame.",
			"Make an exhaustive list of everything you might do and do the last thing on the list.",
			"Make a sudden, destructive unpredictable action; incorporate.",
			"Only one element of each kind.",
			"Remember those quiet evenings.",
			"Remove ambiguities and convert to specifics.",
			"Remove specifics and convert to ambiguities.",
			"Repetition is a form of change.",
			"Reverse.",
			"Simple subtraction.",
			"Spectrum analysis.",
			"Take a break.",
			"Take away the elements in order of apparent non-importance.",
			"Tidy up.",
			"Turn it upside down.",
			"Twist the spine.",
			"Use an old idea.",
			"Use an unacceptable color.",
			"Water.",
			"What are you really thinking about just now? Incorporate.",
			"What is the reality of the situation?",
			"What mistakes did you make last time?",
			"What wouldn't you do?",
			"Work at a different speed.",
			//From Pete
			"Take a walk.", 
			"Take a shower.",
			"Look to Nature.", 
			"Talk it through with a friend.",
			"Who's my audience.",
			"Forget the money, make it cool."
		};
}
