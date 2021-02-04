package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Random ran = new Random();
	boolean gameover = false;
	Robot[] robs = new Robot[5];
	int[] turns = new int[5];
		//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.
for(int i=0; i<robs.length;i++) {
	
	robs[i]= new Robot();
	robs[i].setY(300);
	robs[i].setX(100);
	robs[i].setSpeed(100);
	
			
}
			//4. make each robot start at the bottom of the screen, side by side, facing up
while(!gameover) {
for(int f=0; f<robs.length;f++) {
int move = ran.nextInt(50);
for(int i = 0; i<move;i++) {
	turns[f]=turns[f]+1;
robs[f].move(5);
robs[f].turn(1);
}
	if(turns[f]>=360) {
      gameover=true;
      System.out.println("Robot number "+f+" WON");
      break;
}
}
}
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	
}
}