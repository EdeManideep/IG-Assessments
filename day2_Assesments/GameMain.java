package day2;

public class GameMain {

	public static void main(String[] args) {
		Game[] games= new Game[5];
		games[0]=new Cricket();
		games[1]=new Tennis();
		games[2]=new FootBall();
		games[3]=new FootBall();
		games[4]=new Cricket();
		for(Game i:games)
		{
			i.displayInfo();
		}
	}

}
