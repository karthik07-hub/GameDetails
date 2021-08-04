package project1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
   /*  */
public class Game_Details_app {
	ArrayList< GameDetails>gameDetailslist=new ArrayList<>();
	public static void main(String[] args) 
	{     /*the game details are added to the game detailslist  */
		ArrayList< GameDetails>gameDetailslist=new ArrayList<>();
      GameDetails gameDetails1=new GameDetails("g1","p1",11,100);
      gameDetailslist.add(gameDetails1);
      GameDetails gameDetails2=new GameDetails("g1","p2",99,120);
      gameDetailslist.add(gameDetails2);
      GameDetails gameDetails3=new GameDetails("g1","p3",27,130);
      gameDetailslist.add(gameDetails3);
      GameDetails gameDetails4=new GameDetails("g1","p4",240,1160);
      gameDetailslist.add(gameDetails4);
      GameDetails gameDetails5=new GameDetails("g2","p5",99,1250);
      gameDetailslist.add(gameDetails5);
      GameDetails gameDetails6=new GameDetails("g2","p6",100,1430);
      gameDetailslist.add(gameDetails6);
      GameDetails gameDetails7=new GameDetails("g3","p7",198,1401);
      gameDetailslist.add(gameDetails7);
      GameDetails gameDetails8=new GameDetails("g3","p8",270,1140);
      gameDetailslist.add(gameDetails8);
      GameDetails gameDetails9=new GameDetails("g4","p9",143,1490);
      gameDetailslist.add(gameDetails9);
      GameDetails gameDetails10=new GameDetails("g5","p10",320,3140);
      gameDetailslist.add(gameDetails10);
		
		/* checks for the game details using the game id*/
	System.out.println("Enter the Game Id:");
	Scanner myObj = new Scanner(System.in);
	String gameId =myObj.nextLine();
	/* using the game id given by the user, it generates players count,age of the game and the revenue collected from the game */
	int playersCout=0;
	int revenue=0;
	ArrayList ages=new ArrayList();
	for ( GameDetails gameDetail:gameDetailslist)
	{
	if(gameDetail.getGameId().equalsIgnoreCase(gameId))
	{
		
		ages.add(gameDetail.getDate());
		playersCout=playersCout+1;
		revenue=revenue+gameDetail.getAmount();
		
	}
	}
	@SuppressWarnings("unchecked")
	int daysinage=(int) Collections.max(ages)-(int) Collections.min(ages);
	System.out.println("total number of players played the game:" +playersCout);
	System.out.println("the age of the game:"+daysinage  );
	System.out.println("Total revenue:"+revenue);
	
	}
}  

	
	


