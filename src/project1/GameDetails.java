package project1;

public class GameDetails 
{
	
	
	public String getGameId() {
		return gameId;
	}
	public String getPlayerId() {
		return playerId;
	}
	public int getDate() {
		return date;
	}
	public GameDetails(String gameId, String playerId, int date, int amount) {
		super();
		this.gameId = gameId;
		this.playerId = playerId;
		this.date = date;
		this.amount = amount;
	}
	public int getAmount() {
		return amount;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	private String gameId;
	private String playerId;
	private int date;
	private int amount;
	
	

}
