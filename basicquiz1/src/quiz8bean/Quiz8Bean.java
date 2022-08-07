package quiz8bean;

public class Quiz8Bean {
	private int playerSum;
	private int comSum;
	
	public int getPlayerSum() {
		return playerSum;
	}
	public void setPlayerSum(int playerSum) {
		this.playerSum = playerSum;
	}
	public int getComSum() {
		return comSum;
	}
	public void setComSum(int comSum) {
		this.comSum = comSum;
	}
	
	public void addPlayer(int num) {this.playerSum += num;}
	public void addCom(int num) {this.comSum += num;}
	public boolean isUserOver() {return playerSum > 21;}
	public boolean is21() {return playerSum == 21;}
	public boolean isComOver() {return comSum >21;}
	public boolean isComOverPlayer() {return comSum > playerSum;}
}
