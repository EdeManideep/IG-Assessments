package day2;

public class Game {
	public void displayInfo()
	{
		System.out.println("This is a sport.");
	}

}

class Cricket extends Game{
	@Override
	public void displayInfo()
	{
		System.out.println("Cricket is a sport where 2 teams play, each team has 11 players ");;
	}
}
	
	
class FootBall extends Game{
	@Override
	public void displayInfo()
	{
		System.out.println("in Football the players kick the ball into the net");	
	}
}
	
class Tennis extends Game{
	@Override
	public void displayInfo()
	{
	   System.out.println("Tennis is played using a racket and a ball");
	}
}


