package logic;
/* fill code */

public class PlayerStatus {

	private boolean gameover, win;
	private int score;
	private int life;
	private int requiredCellsOpening;

	public PlayerStatus(int requiredCellsOpening) {
		/* fill code */
	}

	public boolean isGameover() {
		return gameover;
	}

	public void setGameover(boolean gameover) {
		this.gameover = gameover;
	}

	public boolean isWin() {
		return win;
	}

	public void setWin(boolean win) {
		this.win = win;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		/* fill code */
	}

	public void openNewNonBombCell() {
		/* fill code */
	}
}
